package com.kirana.register.service;

import com.kirana.register.controller.TransactionReportResponse;
import com.kirana.register.controller.TransactionResponse;
import com.kirana.register.entity.Transaction;
import com.kirana.register.entity.TransactionType;
import com.kirana.register.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
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

    @Override
    public List<TransactionReportResponse> getTransactionReport(String range, Long storeId) {
        LocalDate startDate = determineStartDate(range);
        LocalDate endDate = LocalDate.now(); // Assuming current date as end date

        List<Transaction> transactions = transactionRepository.findByDateRangeAndStoreId(startDate, endDate, storeId);

        Map<LocalDate, Double> dailyTotalAmounts = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getDate, Collectors.summingDouble(Transaction::getAmount)));

        return dailyTotalAmounts.entrySet().stream()
                .map(entry -> new TransactionReportResponse(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());
    }

    private LocalDate determineStartDate(String range) {
        switch (range.toLowerCase()) {
            case "daily":
                return LocalDate.now();
            case "monthly":
                return LocalDate.now().withDayOfMonth(1);
            case "yearly":
                return LocalDate.now().withDayOfYear(1);
            default:
                throw new IllegalArgumentException("Invalid range parameter. Supported values: daily, monthly, yearly");
        }
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

