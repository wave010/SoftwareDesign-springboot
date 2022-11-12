package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Lab502Application {

	// Using @Component Annotation 
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Lab502Application.class, args);
		PartService P1 = context.getBean(CpuPart.class); 
		System.out.println("CPU Info: "+P1.getinfo());
	}

}
