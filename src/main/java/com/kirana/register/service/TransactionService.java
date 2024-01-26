package com.kirana.register.service;

import com.kirana.register.dto.TransactionDTO;

public interface TransactionService {
    String saveTransaction(TransactionDTO transaction);

}
