package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Lab406Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Lab406Application.class, args);
		Device com = context.getBean(Computer.class);
		System.out.println("Type: "+com.display());
		
		Device phone = context.getBean(SmartPhone.class);
		System.out.println("Type: "+phone.display());
	}

}