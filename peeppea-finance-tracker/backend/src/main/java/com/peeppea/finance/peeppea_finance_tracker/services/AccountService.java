package com.peeppea.finance.peeppea_finance_tracker.service;

import com.peeppea.finance.peeppea_finance_tracker.model.Account;
import com.peeppea.finance.peeppea_finance_tracker.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }

    public Optional<Account> getAccountById(Long accountId) {
        return accountRepository.findById(accountId);
    }

    public List<Account> getAccountsByUserId(Long userId) {
        return accountRepository.findByUserId(userId);
    }

    public void deleteAccount(Long accountId) {
        accountRepository.deleteById(accountId);
    }
}
