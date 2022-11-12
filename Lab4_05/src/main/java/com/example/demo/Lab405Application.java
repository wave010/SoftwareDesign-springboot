package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:Beans.xml")
public class Lab405Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Lab405Application.class, args);
		Device Dev1 = context.getBean("Computer", Computer.class);
		Device Dev2 = context.getBean("SmartPhone", SmartPhone.class);
		System.out.println("Type : "+ Dev1.display());
		System.out.println("Type : "+ Dev2.display());
	}

}
