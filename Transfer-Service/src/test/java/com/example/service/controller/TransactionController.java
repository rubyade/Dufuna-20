package com.example.service.controller;


import com.example.TransferService.Transactions;
import com.example.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransactionController {


    @Autowired
    TransactionService transactionService;

    @RequestMapping("/allTransactions")

    public List<Transactions> getTransactions() {
        return transactionService.getAllTransactions();
    }
}
