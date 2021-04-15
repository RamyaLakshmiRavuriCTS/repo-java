package com.assignment.springannotations;

import org.springframework.stereotype.Component;

/*
 *creating a class for implementing dependency injection using constructor method and implementing interface
 */

@Component
public class HappyFortuneService implements FortuneService {

	//method override from interface
	@Override
	public String getFortune() {
		
		return "Today is your lucky day!";
	}

}

