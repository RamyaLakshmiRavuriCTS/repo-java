package com.assignment.springdemo;

/*
 * creating a class and implementing with the interface
 */
public class HappyFortuneService implements FortuneService {
	
	//overriding the method getFortune 
	@Override
	public String getFortune() {
		return "Today is a lucky day!";
	}

}
