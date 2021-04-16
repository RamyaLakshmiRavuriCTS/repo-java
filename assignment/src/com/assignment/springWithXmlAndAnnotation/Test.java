package com.assignment.springWithXmlAndAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		//Creating spring container and configuring the bean file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieving beans from the container using bean I'd
	    Sports s=context.getBean("mySports",Sports.class);
		
		//Calling the method
		System.out.println(s.getDailyupdate());
		System.out.println(s.getDailyService());
		
		//closing the context
		context.close();
	}

}
