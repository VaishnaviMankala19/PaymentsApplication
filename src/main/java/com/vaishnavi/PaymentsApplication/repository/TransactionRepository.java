package com.vaishnavi.PaymentsApplication.repository;

import com.vaishnavi.PaymentsApplication.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {
    List<TransactionEntity> findByUserId(Long userId);
    List<TransactionEntity> findByUserEmail(String email);

}
