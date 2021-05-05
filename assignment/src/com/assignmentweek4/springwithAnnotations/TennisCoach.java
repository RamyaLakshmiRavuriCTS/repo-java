package com.assignmentweek4.springwithAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/*
 * This is TennisCoach class
 */
@Service
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	public TennisCoach() {
		
	}
/*
 * This is getDailyWorkout method
 */
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your daily tennis match";
	}
/*
 * This is getDailyFortune method
 */
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
