package com.example.demo;
//importing AnnotationConfigApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
/*
 * main class for implementing the annotations
 */
@ComponentScan(basePackages="com.example.demo")
public class MainTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(MainTest.class);
		//get the bean from spring container
		var details=context.getBean(Student.class);
		//displaying details
		System.out.println("Name: "+details.getName());
		System.out.println("Email: "+details.getEmail());
		System.out.println("Address: "+details.getAddress());
		//close the context
		context.close();
	}

}
