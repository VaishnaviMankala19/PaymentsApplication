package com.vaishnavi.PaymentsApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.vaishnavi.PaymentsApplication.service.UserService;

@RestController
@RequestMapping("/api/register")
public class UserRegistrationController {

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public String testRegistration() {
        return userService.testUserRegistrationService();
    }
}
