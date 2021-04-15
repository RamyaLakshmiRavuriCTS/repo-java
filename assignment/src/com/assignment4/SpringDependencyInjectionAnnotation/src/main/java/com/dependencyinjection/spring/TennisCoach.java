package com.dependencyinjection.spring;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
