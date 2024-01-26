package com.kirana.register.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
//@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "kirana_store_id", nullable = false)
    private KiranaStore kiranaStore;

    @Enumerated(EnumType.STRING)
    private TransactionType type;

    private String description;
    private BigDecimal amount;
    private String currency;
    private LocalDateTime timestamp;
}