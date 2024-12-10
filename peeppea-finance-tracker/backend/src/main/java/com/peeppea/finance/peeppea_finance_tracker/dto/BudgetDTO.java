package com.peeppea.finance.peeppea_finance_tracker.dto;

import java.math.BigDecimal;

public class BudgetDTO {
    private Long id;
    private BigDecimal totalBudget;
    private BigDecimal spentAmount;

    // Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public BigDecimal getTotalBudget() {
        return totalBudget;
    }
    public void setTotalBudget(BigDecimal totalBudget) {
        this.totalBudget = totalBudget;
    }
    public BigDecimal getSpentAmount() {
        return spentAmount;
    }
    public void setSpentAmount(BigDecimal spentAmount) {
        this.spentAmount = spentAmount;
    }
}
