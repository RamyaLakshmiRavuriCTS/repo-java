package com.assignmentweek4.springwithxml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * This is SetterDemoApp class
 */
public class SetterDemoApp {
/*
 * This is main method
 */
	public static void main(String[] args) {
		try {

			String xmlFile="applicationContext.xml";

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("xmlFile");
		CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		context.close();
		}
		catch(Exception e) {
			System.out.println("null exception");
		}
	}
}
