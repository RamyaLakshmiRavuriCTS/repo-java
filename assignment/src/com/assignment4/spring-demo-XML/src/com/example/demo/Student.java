package com.example.demo;

public class Student {
	private String name;
	private String email;
	private String address;
	
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
	public void printStudentDetails() {
		System.out.println("Name: "+name);
		System.out.println("Email: "+email);
		System.out.println("Address: "+address);
	}

}
