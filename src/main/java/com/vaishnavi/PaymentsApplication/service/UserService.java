package com.vaishnavi.PaymentsApplication.service;

import com.vaishnavi.PaymentsApplication.entity.UserEntity;
import com.vaishnavi.PaymentsApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String testUserRegistrationService() {
        return "User Registration Service is working!";
    }

    public String testUserLoginService() {
        return "User Login Service is working!";
    }

    public String testUserDetailsService() {
        return "User Details Service is working!";
    }

    public UserEntity getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
