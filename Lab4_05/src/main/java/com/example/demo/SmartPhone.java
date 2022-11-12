package com.example.demo;

public class SmartPhone implements Device {
private String say;
	public String getSay() {
	return say;
}
public void setSay(String say) {
	this.say = say;
}
	@Override
	public String display() {
		return say;
	}

}
