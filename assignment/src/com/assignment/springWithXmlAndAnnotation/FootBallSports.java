package com.assignment.springWithXmlAndAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//implementing from sports interface
@Component
public class FootBallSports implements Sports {

	//Inject dependencies 
	@Autowired
	private Service theService;

	@Override
	public String getDailyupdate() {
		return "Has been playing football for an hour!!";
	}

	@Override
	public String getDailyService() {
		return theService.getDailyService();
	}

}
