package com.assignment.springWithXmlAndAnnotation;

public class HappyService implements Service {

	//implementation methods
	@Override
	public String getDailyService() {
		
		return "Happily serviced the volleyball team!!";
	}

}
