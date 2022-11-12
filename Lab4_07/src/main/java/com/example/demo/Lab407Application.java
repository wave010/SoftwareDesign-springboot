package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Lab407Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab407Application.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
		
		Computer com = context.getBean(Computer.class);
		System.out.println(com.display());
		
		SmartPhone phone = context.getBean(SmartPhone.class);
		System.out.println(phone.display());
	}

}
