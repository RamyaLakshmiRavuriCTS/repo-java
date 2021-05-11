package com.assignmentweek4.springwithxml;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
 * This is HelloSpringApp
 */
public class HelloSpringApp {

	public static void main(String[] args) {

			String xmlFile="applicationContext.xml";
			ClassPathXmlApplicationContext context =
					new ClassPathXmlApplicationContext(xmlFile);
			
			Coach theCoach = context.getBean("myCoach",Coach.class);
			System.out.println(theCoach.getDailyWorkout());
			System.out.println(theCoach.getDailyFortune());
			context.close();
	}

}
