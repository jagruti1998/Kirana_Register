package com.kirana.register.service;

import com.kirana.register.controller.TransactionResponse;
import com.kirana.register.entity.Transaction;
import com.kirana.register.entity.TransactionType;
import com.kirana.register.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;


    @Override
    public List<TransactionResponse> getTransactionsByType(String type) {
        TransactionType transactionType = TransactionType.valueOf(type.toUpperCase());

        List<Transaction> transactions = transactionRepository.findByType(transactionType);

        return convertToResponseFormat(transactions);
    }



    private List<TransactionResponse> convertToResponseFormat(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> new TransactionResponse(
                        transaction.getAmount(),
                        transaction.getCurrency(),
                        transaction.getTimestamp(),
                        transaction.getDescription(),
                        transaction.getKiranaStore().getId()
                ))
                .collect(Collectors.toList());
    }


}

