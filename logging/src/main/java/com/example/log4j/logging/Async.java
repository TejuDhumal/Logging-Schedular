package com.example.log4j.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
@org.springframework.scheduling.annotation.Async
public class Async {

    static Logger logger = LogManager.getLogger(LoggingApplication.class);
    @org.springframework.scheduling.annotation.Async
//    @Scheduled(fixedDelay = 10000)
//    @Scheduled(fixedRate = 1000)
//    @Scheduled(fixedRateString ="PT02S")
    public void Async() throws InterruptedException {
        LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter formate = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:MM:SS");
        String formatedDateTime = current.format(formate);
        logger.info("schedule time " +formatedDateTime);
        System.out.println("Async");
//        Thread.sleep(1000);
    }
}
