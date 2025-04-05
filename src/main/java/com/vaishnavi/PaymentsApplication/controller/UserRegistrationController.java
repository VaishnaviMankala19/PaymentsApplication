package com.vaishnavi.PaymentsApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.vaishnavi.PaymentsApplication.entity.UserEntity;
import com.vaishnavi.PaymentsApplication.service.UserService;

@Controller
public class UserRegistrationController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String showRegisterForm() {
        return "register";
    }

    @PostMapping("/register")
    public String handleRegister(@ModelAttribute UserEntity user, Model model) {
        try {
            userService.registerUser(user);
            model.addAttribute("message", "Registration successful. Please login.");
            return "login"; // redirect to login.jsp
        } catch (Exception e) {
            model.addAttribute("error", "Email already registered.");
            return "register";
        }
    }
}

