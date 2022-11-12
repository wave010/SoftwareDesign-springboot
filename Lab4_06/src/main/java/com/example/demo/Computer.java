package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Computer implements Device {

	@Override
	public String display() {
		return "Computer";
	}

}
