package com.assignment.springannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/*
 * creating a class TennisCoach by implementing Coach interface
 */

//importing the componnet annotation
import org.springframework.stereotype.Component;

//defining annotation
@Component
/*
 * creating a class TennisCoach by implementing Coach interface
 */
public class TennisCoach implements Coach {
	
	
	//using autowired for dependency injection implicitily
	//using qualifier annotation to resolve multiple bean issue
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//defining a default constructor
	public TennisCoach() {
		System.out.println(">>TennisCoach: inside default constructor");
	}
		
	//overriding the methods from coach interface
	@Override
	public String getDailyWorkout() { 
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

