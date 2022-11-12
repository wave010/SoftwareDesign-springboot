package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class SmartPhone implements Device {

	@Override
	public String display() {
		return "SmartPhone";
	}

}
