package com.thomas.springbootstarter;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAppDataApiApplication {
	final static Logger logger = Logger.getLogger(SpringAppDataApiApplication.class.getName());
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAppDataApiApplication.class, args);
		logger.debug(" +++++++++++ RUNNING SPRING BOOT APP ++++++++++++");
		System.out.println(" %%%%%%%%%%%%% RUNNING SPRING BOOT APP %%%%%%%%%%%%%");
		
	}
}
