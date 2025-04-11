package com.vaishnavi.PaymentsApplication.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vaishnavi.PaymentsApplication.service.TransactionService;

import jakarta.servlet.http.HttpSession;

@Controller
public class AddMoneyController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("/addmoney")
    public String addMoney(@RequestParam("amount") double amount, HttpSession session, Model model) {
        String email = (String) session.getAttribute("userEmail");
        if (email != null) {
            transactionService.addMoneyToUser(email, amount);
            model.addAttribute("success", "Money added successfully!");
        } else {
            model.addAttribute("error", "Please login first.");
        }
        return "redirect:/dashboard";
    }

    @GetMapping("/addmoney")
    public String showAddMoneyPage() {
        return "addmoney";
    }
}
