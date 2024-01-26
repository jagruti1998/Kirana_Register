package com.kirana.register.constants.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TransactionTypeEnum {
    CREDIT("CREDIT"),
    DEBIT("DEBIT");

    private final String label;

    public String getLabel() { return label; }
}
