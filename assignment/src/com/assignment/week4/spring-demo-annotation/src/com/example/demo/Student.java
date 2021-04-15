package com.example.demo;
// This class is to acquire the details of student 
public class Student {
	//initializing variables
	private String name;
	private String email;
	private String address;
	
	public Student(String name,String email,String address) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
	}
	
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
