package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableTransactionManagement
@SpringBootApplication 
public class SpringBootDemoApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringBootDemoApplication.class);

	public static void main(String[] args) {
	
		logger.info("Application Started.... ");
		SpringApplication.run(SpringBootDemoApplication.class, args);
		System.out.println(" i win this time");
	}
	
}