package com.peeppea.finance.peeppea_finance_tracker.model;

public class Account {
    private Long id;
    private String name;
    private String type; // Checking, Savings, etc.
    private Double balance;
    private User user;

    // Constructors
    public Account() {}

    public Account(Long id, String name, String type, Double balance, User user) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.balance = balance;
        this.user = user;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
