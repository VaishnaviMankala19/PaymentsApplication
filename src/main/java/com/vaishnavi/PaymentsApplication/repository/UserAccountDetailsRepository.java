package com.vaishnavi.PaymentsApplication.repository;

import com.vaishnavi.PaymentsApplication.entity.UserAccountDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountDetailsRepository extends JpaRepository<UserAccountDetailsEntity, Long> {
    UserAccountDetailsEntity findByUserId(Long userId);
    UserAccountDetailsEntity findByUserEmail(String email);
}
