package com.greenfox.exam.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);
		SpringApplication springApplication = new SpringApplication();
		ApplicationContext applicationContext = springApplication.run(Application.class,args);
	}
}
