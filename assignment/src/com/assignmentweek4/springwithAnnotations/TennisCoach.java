package com.assignmentweek4.springwithAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	public TennisCoach() {
		
	}/*
	@PostConstruct
	public void initialStart() {
		System.out.println("Initial method");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy method");
	}
	*/
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your daily tennis match";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
