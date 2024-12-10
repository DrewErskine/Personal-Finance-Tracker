package com.peeppea.finance.peeppea_finance_tracker.service;

import com.peeppea.finance.peeppea_finance_tracker.model.Goal;
import com.peeppea.finance.peeppea_finance_tracker.repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GoalService {

    @Autowired
    private GoalRepository goalRepository;

    public Goal saveGoal(Goal goal) {
        return goalRepository.save(goal);
    }

    public Optional<Goal> getGoalById(Long goalId) {
        return goalRepository.findById(goalId);
    }

    public List<Goal> getGoalsByUserId(Long userId) {
        return goalRepository.findByUserId(userId);
    }

    public void deleteGoal(Long goalId) {
        goalRepository.deleteById(goalId);
    }
}
