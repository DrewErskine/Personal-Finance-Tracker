package com.peeppea.finance.peeppea_finance_tracker.model;

public class Budget {
    private Long id;
    private User user;
    private String category;
    private Double limit;
    private Double spent;

    // Constructors
    public Budget() {}

    public Budget(Long id, User user, String category, Double limit, Double spent) {
        this.id = id;
        this.user = user;
        this.category = category;
        this.limit = limit;
        this.spent = spent;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }

    public Double getSpent() {
        return spent;
    }

    public void setSpent(Double spent) {
        this.spent = spent;
    }
}
