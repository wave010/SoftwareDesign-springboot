package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:Beans.xml")
public class Lab404Application {

	public static void main(String[] args) {
		//ApplicationContext เป็นตัวสร้าง Spring IoC Container
		ConfigurableApplicationContext context = SpringApplication.run(Lab404Application.class, args);
		System.out.println("Hello spring boot");
		//Tightly coupled code
		System.out.println("Output of the code is the hightly coupled style");
		Device Dev1 = new Computer();
		Device Dev2 = new SmartPhone();
		System.out.println("Type : "+ Dev1.display());
		System.out.println("Type : "+ Dev2.display());
		
		//Tightly coupled code
		System.out.println("Output of the code is the loosely coupled style");
		Device Dev3 = context.getBean("Computer", Computer.class);
		Device Dev4 = context.getBean("SmartPhone", SmartPhone.class);
		System.out.println("Type : "+ Dev3.display());
		System.out.println("Type : "+ Dev4.display());

	}

}
