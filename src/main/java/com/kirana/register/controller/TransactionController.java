package com.kirana.register.controller;

import com.kirana.register.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/{type}")
    public ResponseEntity<List<TransactionResponse>> getTransactionsByType(@PathVariable String type) {
        List<TransactionResponse> transactions = transactionService.getTransactionsByType(type);
        return ResponseEntity.ok(transactions);
    }
}

