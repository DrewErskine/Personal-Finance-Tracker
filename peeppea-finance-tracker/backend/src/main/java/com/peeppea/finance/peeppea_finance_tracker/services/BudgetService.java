package com.peeppea.finance.peeppea_finance_tracker.service;

import com.peeppea.finance.peeppea_finance_tracker.model.Budget;
import com.peeppea.finance.peeppea_finance_tracker.repository.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BudgetService {

    @Autowired
    private BudgetRepository budgetRepository;

    public Budget saveBudget(Budget budget) {
        return budgetRepository.save(budget);
    }

    public Optional<Budget> getBudgetById(Long budgetId) {
        return budgetRepository.findById(budgetId);
    }

    public List<Budget> getBudgetsByUserId(Long userId) {
        return budgetRepository.findByUserId(userId);
    }

    public Budget getBudgetByUserAndCategory(Long userId, String category) {
        return budgetRepository.findByUserIdAndCategory(userId, category);
    }

    public void deleteBudget(Long budgetId) {
        budgetRepository.deleteById(budgetId);
    }
}
