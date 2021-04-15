package com.assignment.springannotations;

//importing Component
import org.springframework.stereotype.Component;

/*
 * creating a datbasefortune class as to examplify quantifier annotation
 */
@Component
public class DatabaseFortuneService implements FortuneService {

	//overriding the methods of fortuneservice interface
	@Override
	public String getFortune() {
		return null;
	}

}
