package com.assignmentweek4.springwithxml;

/*
 * This is HappyFortuneService class
 */
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is IPL day";
	
	}
}
