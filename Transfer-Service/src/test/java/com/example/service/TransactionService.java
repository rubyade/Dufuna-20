package com.example.service;

import com.example.TransferService.Transactions;
import com.example.TransferService.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    public List<Transactions> getAllTransactions() {
        List<Transactions> transactions = transactionRepository.findAll();
        return transactions;
    }
}
