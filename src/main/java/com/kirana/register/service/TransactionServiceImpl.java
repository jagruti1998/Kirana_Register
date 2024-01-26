package com.kirana.register.service;

import com.kirana.register.dto.TransactionDTO;
import com.kirana.register.entity.Transaction;
import com.kirana.register.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public String saveTransaction(TransactionDTO transaction) {
        try {
            if (transaction.getCurrency().equals("USD")) {

            }
            Transaction transactionObj = new Transaction();
            transactionObj.setTransactionType(transaction.getTransactionType().getLabel());
            transactionObj.setAmount(transaction.getAmount());
            transactionObj.setCustomerName(transaction.getCustomerName());
            transactionObj.setTimestamp(LocalDateTime.now());

            transactionRepository.save(transactionObj);
            return "Record saved sucessfully!! " + transactionObj.getId().toString();
        } catch (Exception e) {
            throw e;
        }
    }

    public double convertUSDtoINR(double usdAmount) {

        return usdAmount;
    }
    



}