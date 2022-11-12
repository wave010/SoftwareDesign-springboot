package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {

	@Bean
	public Computer getCom() {
		return new Computer();
	}
	
	@Bean
	public SmartPhone getPhone() {
		return new SmartPhone();
	}
}
