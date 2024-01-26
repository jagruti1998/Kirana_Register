package com.kirana.register.repository;

import com.kirana.register.entity.Transaction;
import com.kirana.register.entity.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findByType(TransactionType type);



}
