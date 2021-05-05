package com.assignment.springannotations;

//importing Classpathxmlapplicationcontext
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * main class for implementing the annotations
 */
public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
	
		//close the context
		context.close();

	}

}
