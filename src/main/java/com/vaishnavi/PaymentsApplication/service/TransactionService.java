package com.vaishnavi.PaymentsApplication.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaishnavi.PaymentsApplication.entity.TransactionEntity;
import com.vaishnavi.PaymentsApplication.entity.UserAccountDetailsEntity;
import com.vaishnavi.PaymentsApplication.entity.UserEntity;
import com.vaishnavi.PaymentsApplication.repository.TransactionRepository;
import com.vaishnavi.PaymentsApplication.repository.UserAccountDetailsRepository;
import com.vaishnavi.PaymentsApplication.repository.UserRepository;

@Service
public class TransactionService {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private UserAccountDetailsRepository userAccountDetailsRepo;

    @Autowired
    private TransactionRepository transactionRepo;

    public void addMoneyToUser(String email, double amount) {
        UserEntity user = userRepo.findByEmail(email);

        if (user == null) {
            throw new RuntimeException("User not found with email: " + email);
        }

        UserAccountDetailsEntity details = userAccountDetailsRepo.findByUserEmail(email);

        if (details == null) {
            // Create account details for the user if not present
            details = new UserAccountDetailsEntity();
            details.setUser(user);
            details.setBalance(amount);
            details.setAccountStatus("ACTIVE");
        } else {
           
            details.setBalance(details.getBalance() + amount);
        }

        userAccountDetailsRepo.save(details);

        
        TransactionEntity txn = new TransactionEntity();
        txn.setUser(user);
        txn.setType("CREDIT");
        txn.setAmount(amount);
        txn.setDescription("Money Added to Wallet");
        txn.setTimestamp(LocalDateTime.now());

        transactionRepo.save(txn);
    }
}
