package com.peeppea.finance.peeppea_finance_tracker.scheduler;

import com.peeppea.finance.peeppea_finance_tracker.services.ReportService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ReportScheduler {

    private final ReportService reportService;

    public ReportScheduler(ReportService reportService) {
        this.reportService = reportService;
    }

    /**
     * Generates monthly financial reports at midnight on the first day of every month.
     */
    @Scheduled(cron = "0 0 0 1 * ?")
    public void generateMonthlyReports() {
        System.out.println("Generating monthly financial reports...");
        reportService.generateMonthlyReports();
    }
}
