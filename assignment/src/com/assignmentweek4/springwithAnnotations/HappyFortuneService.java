package com.assignmentweek4.springwithAnnotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is movie release";
	
	}
}
