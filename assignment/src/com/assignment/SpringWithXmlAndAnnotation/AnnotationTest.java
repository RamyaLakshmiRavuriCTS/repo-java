package com.assignment.SpringWithXmlAndAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationTest {

	public static void main(String[] args) {
		
		//reading configuration file
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SportsConfig.class);
		//retrieve bean from the container
		FootBallSports s=context.getBean("footBallSports", FootBallSports.class);
		//method calling
		System.out.println(s.getDailyupdate());
		System.out.println(s.getDailyService()); 
		//closing the context
		context.close();
		

	}

}
