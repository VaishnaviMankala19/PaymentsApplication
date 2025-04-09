package com.vaishnavi.PaymentsApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.vaishnavi.PaymentsApplication.entity.UserEntity;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";  
    }
    @GetMapping("/dashboard")
    public String dashboard(HttpSession session, Model model) {
        UserEntity user = (UserEntity) session.getAttribute("loggedInUser");
        model.addAttribute("user", user);
        return "dashboard";
    }


}
