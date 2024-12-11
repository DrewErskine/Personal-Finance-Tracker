package com.peeppea.finance.peeppea_finance_tracker.scheduler;

import com.peeppea.finance.peeppea_finance_tracker.services.TemporaryDataService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TemporaryDataCleaner {

    private final TemporaryDataService temporaryDataService;

    public TemporaryDataCleaner(TemporaryDataService temporaryDataService) {
        this.temporaryDataService = temporaryDataService;
    }

    /**
     * Cleans temporary data every day at 2 AM.
     */
    @Scheduled(cron = "0 0 2 * * ?")
    public void cleanTemporaryData() {
        System.out.println("Cleaning temporary data...");
        temporaryDataService.cleanTemporaryData();
    }
}
