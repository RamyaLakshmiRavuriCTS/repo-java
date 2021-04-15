package com.assignmentweek4.springwithxml;

public class BaseballCoach implements Coach {
	private FortuneService fortuneService;
	
	
	public BaseballCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}


	@Override
	public String getDailyWorkout() {
	return "30 mins of Baseball practice";
}


	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
