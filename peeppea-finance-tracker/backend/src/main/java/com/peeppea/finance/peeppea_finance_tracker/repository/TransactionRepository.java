package com.peeppea.finance.peeppea_finance_tracker.repository;

import com.peeppea.finance.peeppea_finance_tracker.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByAccountId(Long accountId); // Fetch transactions for a specific account
    List<Transaction> findByDateBetween(LocalDateTime startDate, LocalDateTime endDate); // Transactions in a date range
}
