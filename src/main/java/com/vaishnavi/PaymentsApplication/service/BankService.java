package com.vaishnavi.PaymentsApplication.service;

import com.vaishnavi.PaymentsApplication.entity.BankAccountsEntity;
import com.vaishnavi.PaymentsApplication.entity.UserEntity;
import com.vaishnavi.PaymentsApplication.repository.BankAccountRepository;
import com.vaishnavi.PaymentsApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankService {

    @Autowired
    private BankAccountRepository bankAccountRepository;

    @Autowired
    private UserRepository userRepository;

    public BankAccountsEntity addBankAccount(Long userId, BankAccountsEntity bankAccount) {
        Optional<UserEntity> userOpt = userRepository.findById(userId);
        if (userOpt.isPresent()) {
            bankAccount.setUser(userOpt.get());
            bankAccount.setStatus("ACTIVE");
            return bankAccountRepository.save(bankAccount);
        } else {
            throw new RuntimeException("User not found");
        }
    }
    public List<BankAccountsEntity> getUserBankAccounts(String email) {
        UserEntity user = userRepository.findByEmail(email);
        return bankAccountRepository.findByUserAndStatus(user, "ACTIVE");
    }
    public void removeBankAccount(Long bankId) {
        bankAccountRepository.softDeleteById(bankId);
    }

}
