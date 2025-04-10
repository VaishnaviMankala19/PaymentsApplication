package com.vaishnavi.PaymentsApplication.controller;

import com.vaishnavi.PaymentsApplication.entity.BankAccountsEntity;
import com.vaishnavi.PaymentsApplication.entity.UserEntity;
import com.vaishnavi.PaymentsApplication.service.BankService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AddBankController {

    @Autowired
    private BankService bankService;

    @GetMapping("/add-bank")
    public String showAddBankForm(Model model) {
        model.addAttribute("bankAccount", new BankAccountsEntity());
        return "addbankform";
    }

    @PostMapping("/add-bank")
    public String addBank(@ModelAttribute("bankAccount") BankAccountsEntity bankAccount, HttpSession session) {
       
    	UserEntity user = (UserEntity) session.getAttribute("loggedInUser");

        if (user == null) return "redirect:/login";

        bankService.addBankAccount(user.getId(), bankAccount);
        return "redirect:/dashboard";
    }

}
