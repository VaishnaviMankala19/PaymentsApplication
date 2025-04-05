package com.vaishnavi.PaymentsApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.vaishnavi.PaymentsApplication.service.BankService;

@RestController
@RequestMapping("/api/bank/view")
public class ViewBankDetailsController {

    @Autowired
    private BankService bankService;

    @GetMapping("/test")
    public String testViewBankDetails() {
        return bankService.testViewBankDetailsService();
    }
    
    
}
