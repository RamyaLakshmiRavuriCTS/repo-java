package com.assignment.springannotations;

import org.springframework.stereotype.Service;

/*
 * creating a datbasefortune class as to examplify quantifier annotation
 */
@Service
public class DatabaseFortuneService implements FortuneService {

	//overriding the methods of fortuneservice interface
	@Override
	public String getFortune() {
		return null;
	}

}
