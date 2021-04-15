package com.assignment.springdemo;

/*
*creating another cricket class and implementing with coach interface 
*/
public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach:inside no-arg constructor");
	}
	
	//creating a setter methods
		public void setFortuneService(FortuneService fortuneService) {
			System.out.println("CricketCoach:inside setter method - setFortuneService");
			this.fortuneService = fortuneService;
		}	

		//overriding the methods from interface coach
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowliung for 15 minutes";
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
