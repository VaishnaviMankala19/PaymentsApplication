package com.vaishnavi.PaymentsApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.vaishnavi.PaymentsApplication.service.BankService;

@RestController
@RequestMapping("/api/bank/add")
public class AddBankController {

    @Autowired
    private BankService bankService;

    @GetMapping("/test")
    public String testAddBank() {
        return bankService.testAddBankService();
    }
}
