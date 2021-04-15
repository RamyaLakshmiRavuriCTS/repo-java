package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="com.example.demo")
public class MainTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(MainTest.class);
		var details=context.getBean(Student.class);
		System.out.println("Name: "+details.getName());
		System.out.println("Email: "+details.getEmail());
		System.out.println("Address: "+details.getAddress());
	}

}
