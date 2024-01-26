package com.kirana.register.service;

import com.kirana.register.controller.TransactionResponse;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TransactionServiceImpl implements TransactionService {

    @Override
    public List<TransactionResponse> getTransactionsByType(String type) {
        return null;
    }
}