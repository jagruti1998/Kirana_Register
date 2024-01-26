package com.kirana.register.repository;

import com.kirana.register.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public interface TransactionRepository extends JpaRepository<Transaction, UUID> {
    List<Transaction> findByTimestampBetween(LocalDateTime startDateTime, LocalDateTime endDateTime);
}
