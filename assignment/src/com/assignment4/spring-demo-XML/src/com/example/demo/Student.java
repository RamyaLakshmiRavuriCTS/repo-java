package com.example.demo;
//creating class with variables
public class Student {
	//initializing variables
	private String name;
	private String email;
	private String address;
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	//method to displaying student details
	public void printStudentDetails() {
		System.out.println("Name: "+name);
		System.out.println("Email: "+email);
		System.out.println("Address: "+address);
	}

}
