package com.vaishnavi.PaymentsApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.vaishnavi.PaymentsApplication.entity.UserEntity;
import com.vaishnavi.PaymentsApplication.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserDetailsController {

    @Autowired
    private UserService userService;

    @GetMapping("/profile")
    public String profile(HttpSession session , Model model) {
        UserEntity user = (UserEntity) session.getAttribute("loggedInUser");
        model.addAttribute("user", user);
        return "profile";
    }

    @GetMapping("/editprofile")
    public String editprofile(HttpSession session, Model model) {
        UserEntity user = (UserEntity) session.getAttribute("loggedInUser");
        model.addAttribute("user", user);
        return "editprofile";
    }

    @PostMapping("/updateProfile")
    public String updateProfile(@ModelAttribute UserEntity updatedUser, HttpSession session) {
        UserEntity existingUser = (UserEntity) session.getAttribute("loggedInUser");

        
        updatedUser.setId(existingUser.getId());
        updatedUser.setPassword(existingUser.getPassword());

        userService.updateUser(updatedUser);

       
        session.setAttribute("loggedInUser", updatedUser);

        return "redirect:/profile";
    }

}
