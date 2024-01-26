package com.kirana.register.dto;

import com.kirana.register.constants.enums.TransactionTypeEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionDTO {
    private TransactionTypeEnum transactionType;
    private double amount;
    private String currency;
    private String customerName;
}
