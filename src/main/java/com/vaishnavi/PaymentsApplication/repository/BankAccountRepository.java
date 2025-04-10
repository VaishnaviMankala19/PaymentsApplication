package com.vaishnavi.PaymentsApplication.repository;

import com.vaishnavi.PaymentsApplication.entity.BankAccountsEntity;
import com.vaishnavi.PaymentsApplication.entity.UserEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BankAccountRepository extends JpaRepository<BankAccountsEntity, Long> {
    List<BankAccountsEntity> findByUserId(Long userId);
    List<BankAccountsEntity> findByUserIdAndStatus(Long userId , String status);
    List<BankAccountsEntity> findByUser(UserEntity user);

    // ✅ This is the missing method used in your BankService
    List<BankAccountsEntity> findByUserAndStatus(UserEntity user, String status);

    @Transactional
    @Modifying
    @Query("UPDATE BankAccountsEntity b SET b.status = 'INACTIVE' WHERE b.id = :bankId")
    void softDeleteById(Long bankId);
}
