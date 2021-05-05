package com.assignmentweek4.springwithAnnotations;

import java.util.Random;

import org.springframework.stereotype.Service;

/*
 * This is RandomFortuneService class
 */
@Service
public class RandomFortuneService implements FortuneService {
	/*
	 * This is getFortune method
	 */
	@Override
	public String getFortune() {

		
		String[] data = { "Beware of Enemies",
				"Be Kind",
				"Be Brave",
				};
		Random myRandom = new Random();
		int index =myRandom.nextInt(data.length);
		String theFortune =data[index];
		return theFortune;
	}

}
