package com.javaprojects.notifier.config;

import com.javaprojects.notifier.service.BirthdayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class SchedulerConfig {

    @Autowired
    private BirthdayService birthdayService;

    @Scheduled(cron = "0 0 9 * * ?")  // This will run every day at 9:00 AM
    public void scheduleBirthdayEmails() {
        birthdayService.sendBirthdayEmails();
    }
}
