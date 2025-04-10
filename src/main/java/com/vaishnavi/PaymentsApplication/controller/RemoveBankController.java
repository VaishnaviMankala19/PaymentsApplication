package com.vaishnavi.PaymentsApplication.controller;

import com.vaishnavi.PaymentsApplication.entity.BankAccountsEntity;
import com.vaishnavi.PaymentsApplication.entity.UserEntity;
import com.vaishnavi.PaymentsApplication.service.BankService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class RemoveBankController {

    @Autowired
    private BankService bankService;

    @GetMapping("/removebank")
    public String showBankList(HttpSession session, Model model) {
        UserEntity user = (UserEntity) session.getAttribute("loggedInUser");
        if (user == null) return "redirect:/login";

        List<BankAccountsEntity> banks = bankService.getUserBankAccounts(user.getEmail());
        model.addAttribute("banks", banks);
        return "removebank"; // JSP page
    }

    @PostMapping("/removebank/{id}")
    public String removeBank(@PathVariable Long id, HttpSession session) {
        UserEntity user = (UserEntity) session.getAttribute("loggedInUser");
        if (user == null) return "redirect:/login";

        bankService.removeBankAccount(id);
        return "redirect:/removebank";
    }
}
