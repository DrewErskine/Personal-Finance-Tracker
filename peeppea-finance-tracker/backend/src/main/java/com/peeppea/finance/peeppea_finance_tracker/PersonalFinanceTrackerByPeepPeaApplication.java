package com.peeppea.finance.peeppea_finance_tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableScheduling
public class PersonalFinanceTrackerByPeepPeaApplication {
    public static void main(String[] args) {
        SpringApplication.run(PersonalFinanceTrackerByPeepPeaApplication.class, args);
    }
}