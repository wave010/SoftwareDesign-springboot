package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Lab503Application {

	//Using @Bean Annotation
	public static void main(String[] args) {
		SpringApplication.run(Lab503Application.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		CpuPart cpu = context.getBean(CpuPart.class);
		System.out.println(cpu.getinfo());
	}
}
