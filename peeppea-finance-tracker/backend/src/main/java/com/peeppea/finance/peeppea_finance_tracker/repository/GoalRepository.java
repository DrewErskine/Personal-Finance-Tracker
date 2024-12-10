package com.peeppea.finance.peeppea_finance_tracker.repository;

import com.peeppea.finance.peeppea_finance_tracker.model.Goal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoalRepository extends JpaRepository<Goal, Long> {
    List<Goal> findByUserId(Long userId); // Fetch goals for a specific user
}
