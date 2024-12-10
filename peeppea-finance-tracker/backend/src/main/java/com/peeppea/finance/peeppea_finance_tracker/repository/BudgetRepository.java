package com.peeppea.finance.peeppea_finance_tracker.repository;

import com.peeppea.finance.peeppea_finance_tracker.model.Budget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BudgetRepository extends JpaRepository<Budget, Long> {
    List<Budget> findByUserId(Long userId); // Fetch budgets for a specific user
    Budget findByUserIdAndCategory(Long userId, String category); // Fetch a budget by category
}
