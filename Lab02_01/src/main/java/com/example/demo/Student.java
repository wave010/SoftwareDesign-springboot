package com.example.demo;

public class Student {
	private String ID;
	private String name;
	
	public Student() {
		super();
	}
	public Student(String ID, String name) {
		super();
		this.ID = ID;
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
