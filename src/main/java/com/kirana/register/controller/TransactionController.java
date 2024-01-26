package com.kirana.register.controller;

import com.kirana.register.dto.TransactionDTO;
import com.kirana.register.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public String saveTransactions(@RequestBody TransactionDTO transaction) {
        return transactionService.saveTransaction(transaction);
    }


}
