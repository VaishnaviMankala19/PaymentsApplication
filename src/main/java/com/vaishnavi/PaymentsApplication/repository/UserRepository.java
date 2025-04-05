package com.vaishnavi.PaymentsApplication.repository;

import com.vaishnavi.PaymentsApplication.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByEmail(String email);
}
