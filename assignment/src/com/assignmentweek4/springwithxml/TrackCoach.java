package com.assignmentweek4.springwithxml;

/*
 * This is TrackCoach class
 */
public class TrackCoach implements Coach {
	private FortuneService fortuneService;

	public TrackCoach(FortuneService thefortuneService) {
		
		fortuneService = thefortuneService;
	}

	

	@Override
	public String getDailyWorkout() {
		return "Run 5 kms Track";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it : " +fortuneService.getFortune();
	}

}
