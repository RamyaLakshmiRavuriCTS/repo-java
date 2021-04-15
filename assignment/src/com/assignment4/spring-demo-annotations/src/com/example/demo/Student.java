package com.example.demo;
//creating class with variables
public class Student {
	//initializing variables
	private String name;
	private String email;
	private String address;
	//constructor with fields
	public Student(String name, String email, String address) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
	}
//setters and getters
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}


	public String getAddress() {
		return address;
	}


	
}
