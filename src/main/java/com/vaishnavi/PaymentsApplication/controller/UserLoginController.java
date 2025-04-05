package com.vaishnavi.PaymentsApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.vaishnavi.PaymentsApplication.entity.UserEntity;
import com.vaishnavi.PaymentsApplication.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserLoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String handleLogin(@RequestParam String email,
                              @RequestParam String password,
                              Model model,
                              HttpSession session) {
        UserEntity user = userService.loginUser(email, password);
        if (user != null) {
            session.setAttribute("loggedInUser", user);
            model.addAttribute("user", user);
            return "dashboard";  // goes to dashboard.jsp
        } else {
            model.addAttribute("error", "Invalid email or password.");
            return "login";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}
