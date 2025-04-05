package com.vaishnavi.PaymentsApplication.repository;

import com.vaishnavi.PaymentsApplication.entity.BankAccountsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BankAccountRepository extends JpaRepository<BankAccountsEntity, Long> {
    List<BankAccountsEntity> findByUserId(Long userId);
}
