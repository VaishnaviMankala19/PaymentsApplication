package com.vaishnavi.PaymentsApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.vaishnavi.PaymentsApplication.service.TransactionService;

@RestController
@RequestMapping("/api/transaction/view")
public class ViewTransactionsController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/test")
    public String testViewTransactions() {
        return transactionService.testViewTransactionsService();
    }
}
