package com.vaishnavi.PaymentsApplication.controller;

import com.vaishnavi.PaymentsApplication.entity.UserEntity;
import com.vaishnavi.PaymentsApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserDetailsController {

    @Autowired
    private UserService userService;

//    @GetMapping("/test")
//    public String testUserDetails() {
//        return userService.testUserDetailsService();
//    }

    @GetMapping("/dashboard")
    public String showDashboard(Model model) {
        UserEntity user = userService.getUserByEmail("stranger@example.com");
        model.addAttribute("user", user);
        return "dashboard"; 
    }
}
