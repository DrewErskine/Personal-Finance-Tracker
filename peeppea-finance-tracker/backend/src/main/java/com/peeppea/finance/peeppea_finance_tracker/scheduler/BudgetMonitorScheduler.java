package com.peeppea.finance.peeppea_finance_tracker.scheduler;

import com.peeppea.finance.peeppea_finance_tracker.services.BudgetService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class BudgetMonitorScheduler {

    private final BudgetService budgetService;

    public BudgetMonitorScheduler(BudgetService budgetService) {
        this.budgetService = budgetService;
    }

    /**
     * Checks budgets daily at 6 AM.
     */
    @Scheduled(cron = "0 0 6 * * ?")
    public void checkBudgets() {
        System.out.println("Checking user budgets...");
        budgetService.checkBudgets();
    }
}
