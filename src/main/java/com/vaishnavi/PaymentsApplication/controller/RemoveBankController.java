package com.vaishnavi.PaymentsApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.vaishnavi.PaymentsApplication.service.BankService;

@RestController
@RequestMapping("/api/bank/remove")
public class RemoveBankController {

    @Autowired
    private BankService bankService;

    @GetMapping("/test")
    public String testRemoveBank() {
        return bankService.testRemoveBankService();
    }
}
