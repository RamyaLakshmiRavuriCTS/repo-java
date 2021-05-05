package com.assignment.springannotations;


import org.springframework.stereotype.Service;

/*
 *creating a class for implementing dependency injection using constructor method and implementing interface
 */

@Service
public class HappyFortuneService implements FortuneService {

	//method override from fortuneservice interface
	@Override
	public String getFortune() {
		
		return "Today is your lucky day!";
	}

}

