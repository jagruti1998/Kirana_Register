package com.kirana.register.service;

import com.kirana.register.controller.TransactionReportResponse;
import com.kirana.register.controller.TransactionResponse;


import java.util.List;

public interface TransactionService {

    List<TransactionResponse> getTransactionsByType(String type);
    List<TransactionReportResponse> getTransactionReport(String range, Long storeId);


}
