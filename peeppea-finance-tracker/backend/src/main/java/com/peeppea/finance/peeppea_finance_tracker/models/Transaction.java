package com.peeppea.finance.peeppea_finance_tracker.model;

import java.time.LocalDateTime;

public class Transaction {
    private Long id;
    private Account account;
    private Double amount;
    private String type; // Income or Expense
    private LocalDateTime date;
    private String description;

    // Constructors
    public Transaction() {}

    public Transaction(Long id, Account account, Double amount, String type, LocalDateTime date, String description) {
        this.id = id;
        this.account = account;
        this.amount = amount;
        this.type = type;
        this.date = date;
        this.description = description;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
