package com.example.log4j.logging;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import static sun.net.ftp.impl.FtpClient.logger;

@Component
@EnableAsync
public class Schedular {

    static Logger logger = LogManager.getLogger(LoggingApplication.class);

    @Async
    @Scheduled(fixedDelay = 5000)
//    @Scheduled(fixedRate = 1000)
//    @Scheduled(fixedRateString ="PT02S")
    public void schedular() throws InterruptedException {
        LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter formate = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:MM:SS");
        String formatedDateTime = current.format(formate);
        logger.info("schedule time" +formatedDateTime);
        System.out.println("scheduling");
        Thread.sleep(1000);
    }
}
