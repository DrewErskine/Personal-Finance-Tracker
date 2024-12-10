package com.peeppea.finance.peeppea_finance_tracker.repository;

import com.peeppea.finance.peeppea_finance_tracker.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> findByUserId(Long userId); // Fetch all accounts for a specific user
}
