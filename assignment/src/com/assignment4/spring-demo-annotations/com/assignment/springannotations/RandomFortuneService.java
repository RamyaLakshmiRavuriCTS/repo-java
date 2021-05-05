package com.assignment.springannotations;

//importing random from java util
import java.util.Random;

import org.springframework.stereotype.Component;

/*
 * implementing the randomfortuneclass to eamplify quantifier annotation
 */
@Component
public class RandomFortuneService implements FortuneService {

	//create an array of strings
	private String[] data = {
			"Hi yoshitha",
			"The Journey is the reward",
			"welcome to cognizant"
	};
	//create a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		
		return theFortune;
	}

}
