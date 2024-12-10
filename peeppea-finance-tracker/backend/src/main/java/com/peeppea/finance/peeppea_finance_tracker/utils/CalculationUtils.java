package com.peeppea.finance.peeppea_finance_tracker.utils;

public class CalculationUtils {

    public static double calculateSavingsGoalProgress(double currentAmount, double goalAmount) {
        if (goalAmount <= 0) {
            throw new IllegalArgumentException("Goal amount must be greater than zero");
        }
        return (currentAmount / goalAmount) * 100;
    }

    public static double calculateMonthlyBudgetBalance(double totalBudget, double spentAmount) {
        return totalBudget - spentAmount;
    }
}
