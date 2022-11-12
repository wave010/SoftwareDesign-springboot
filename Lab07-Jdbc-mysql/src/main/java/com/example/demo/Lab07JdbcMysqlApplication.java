package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Cache.Connection;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.demo")
public class Lab07JdbcMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab07JdbcMysqlApplication.class, args);
		
	}

}
