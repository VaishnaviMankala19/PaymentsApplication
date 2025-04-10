package com.vaishnavi.PaymentsApplication.controller;

import com.vaishnavi.PaymentsApplication.entity.BankAccountsEntity;
import com.vaishnavi.PaymentsApplication.service.BankService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ViewBankDetailsController {

    @Autowired
    private BankService bankService;

    @GetMapping("/viewbanks")
    public String viewBanks(Model model, HttpSession session) {
        String userEmail = (String) session.getAttribute("userEmail");

        if (userEmail == null) {
            return "redirect:/login";
        }

        List<BankAccountsEntity> bankAccounts = bankService.getUserBankAccounts(userEmail);
        model.addAttribute("banks", bankAccounts);

        return "viewbanks";  
    }
}
