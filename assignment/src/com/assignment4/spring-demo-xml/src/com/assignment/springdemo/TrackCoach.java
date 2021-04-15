package com.assignment.springdemo;

/*
 * creating a class track coach and implementing the coach interface
 */
public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	//calling empty constructor
	public TrackCoach() {
		
	}

	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	//overriding the methods in the coach interface
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do IT : " + fortuneService.getFortune();
	}

}
