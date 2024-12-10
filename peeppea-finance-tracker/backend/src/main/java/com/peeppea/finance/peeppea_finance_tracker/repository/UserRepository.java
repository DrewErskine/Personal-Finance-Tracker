package com.peeppea.finance.peeppea_finance_tracker.repository;

import com.peeppea.finance.peeppea_finance_tracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email); // Custom query to find a user by email
}
