package com.peeppea.finance.peeppea_finance_tracker.scheduler;

import com.peeppea.finance.peeppea_finance_tracker.services.GoalService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class GoalProgressScheduler {

    private final GoalService goalService;

    public GoalProgressScheduler(GoalService goalService) {
        this.goalService = goalService;
    }

    /**
     * Updates goal progress weekly on Sunday at 9 AM.
     */
    @Scheduled(cron = "0 0 9 ? * SUN")
    public void updateGoalProgress() {
        System.out.println("Updating goal progress...");
        goalService.updateGoalProgress();
    }
}
