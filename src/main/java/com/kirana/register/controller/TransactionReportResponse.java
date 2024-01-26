package com.kirana.register.controller;

import java.time.LocalDate;

public class TransactionReportResponse {
    private LocalDate date;
    private double totalAmount;

    // Constructors, getters, and setters

    public TransactionReportResponse(LocalDate date, double totalAmount) {
        this.date = date;
        this.totalAmount = totalAmount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

}
