package com.vaishnavi.PaymentsApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.vaishnavi.PaymentsApplication.service.TransactionService;

@RestController
@RequestMapping("/api/transaction/make")
public class MakeTransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/test")
    public String testMakeTransaction() {
        return transactionService.testMakeTransactionService();
    }
}
