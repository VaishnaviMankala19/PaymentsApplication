package com.vaishnavi.PaymentsApplication.service;

import com.vaishnavi.PaymentsApplication.entity.UserEntity;
import com.vaishnavi.PaymentsApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserEntity registerUser(UserEntity user) {
        return userRepository.save(user);
    }

    public UserEntity loginUser(String email, String password) {
        UserEntity user = userRepository.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
    public void updateUser(UserEntity user) {
        userRepository.save(user);  
    }
}
