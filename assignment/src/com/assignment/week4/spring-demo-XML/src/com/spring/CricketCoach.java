package com.spring;

public class CricketCoach implements ICoach {
	
	private IFortuneService fortuneService;
	
	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach:inside no-arg constructor");
	}
	
	//creating a setter methods
		public void setFortuneService(IFortuneService fortuneService) {
			System.out.println("CricketCoach:inside setter method - setFortuneService");
			this.fortuneService = fortuneService;
		}	

	//overriding the methods from interface coach
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}