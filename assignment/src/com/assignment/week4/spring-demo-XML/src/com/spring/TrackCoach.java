package com.spring;

public class TrackCoach implements ICoach {
	
	private IFortuneService fortuneService;

	public TrackCoach(IFortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: "+ fortuneService.getFortune();
	}

}
