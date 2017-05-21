package com.thomas.springbootstarter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAppDataApiApplication {
	final static Logger logger = LoggerFactory.getLogger(SpringAppDataApiApplication.class.getName());
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAppDataApiApplication.class, args);
		logger.debug(" +++++++++++ STARTING SPRING BOOT APP :" + SpringAppDataApiApplication.class.getName() );
		
	}
}
