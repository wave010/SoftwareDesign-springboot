package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:Beans.xml")
public class Lab501Application {

	//Creating Bean Inside an XML Configuration File (beans.xml)
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Lab501Application.class, args);
		PartService P1 = context.getBean("CpuPart",CpuPart.class); 
		System.out.println("CPU Info: "+P1.getinfo());
	}

}
