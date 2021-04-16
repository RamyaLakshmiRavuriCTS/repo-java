package com.assignment.springWithXmlAndAnnotation;

import org.springframework.stereotype.Component;

//implementing from service interface
@Component
public class AngryService implements Service {

	@Override
	public String getDailyService() {
		return "Service is not good and that made me anger towards the team.";
	}

}
