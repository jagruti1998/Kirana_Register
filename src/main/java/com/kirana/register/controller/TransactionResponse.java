package com.kirana.register.controller;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransactionResponse {

    private BigDecimal amount;
    private String currency;
    private LocalDateTime dateTime;
    private String description;
    private Long kiranaStoreId;

    public TransactionResponse(BigDecimal amount, String currency, LocalDateTime dateTime, String description, Long kiranaStoreId) {
        this.amount = amount;
        this.currency = currency;
        this.dateTime = dateTime;
        this.description = description;
        this.kiranaStoreId = kiranaStoreId;
    }

}

