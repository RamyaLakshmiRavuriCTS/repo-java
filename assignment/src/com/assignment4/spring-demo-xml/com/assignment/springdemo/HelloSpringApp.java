package com.assignment.springdemo;

/*
 *importing  classpathxmlapplicationcontext
 *creating main class for bean configuration
 */
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		String XML_FILE_NAME ="applicationContext.xml";
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("XML_FILE_NAME");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//lets call new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();

	}

}
