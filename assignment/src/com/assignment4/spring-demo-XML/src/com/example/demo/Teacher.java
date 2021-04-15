package com.example.demo;
//creating class with variables
public class Teacher {
	//initializing variables
	private String name;
	private String qualification;
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public Teacher(String name, String qualification) {
		super();
		this.name = name;
		this.qualification = qualification;
	}
	//method to display staff details
	public void printStaffDetails() {
		System.out.println("Name: "+name);
		System.out.println("Qualification: "+qualification);
	}

}
