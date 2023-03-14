package com.example.log4j.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LoggingApplication {

	static Logger logger = LogManager.getLogger(LoggingApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(LoggingApplication.class, args);

		System.out.println("Hello....");

		logger.trace("this is trace");
		logger.debug("this is debug");
		logger.info("this is info");
		logger.error("this is error");
		logger.warn("this is warn");
		logger.fatal("this is fatal");

	}

}
