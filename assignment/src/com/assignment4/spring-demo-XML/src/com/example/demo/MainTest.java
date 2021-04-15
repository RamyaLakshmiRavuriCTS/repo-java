package com.example.demo;
//importing ClassPathXmlApplicationContext
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.Student;
/*
 * main class for implementing the annotations
 */
public class MainTest {

	public static void main(String[] args) {
		//read spring configuration file
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//get the bean from spring container
		Student student=(Student) context.getBean("studentbean");
		//call method to get the student details
		student.printStudentDetails();
		//get the bean from spring container
		Teacher teacher=(Teacher) context.getBean("details");
		//call method to get to get staff details
		teacher.printStaffDetails();
		

	}

}
