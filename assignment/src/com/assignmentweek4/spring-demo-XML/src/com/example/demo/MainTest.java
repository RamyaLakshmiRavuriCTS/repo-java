package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.Student;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student=(Student) context.getBean("studentbean");
		student.printStudentDetails();
		
		Teacher teacher=(Teacher) context.getBean("details");
		teacher.printStaffDetails();
		

	}

}
