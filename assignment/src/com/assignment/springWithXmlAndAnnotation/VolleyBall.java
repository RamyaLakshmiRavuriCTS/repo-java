package com.example.demo;

public class VolleyBall implements Sports {

	//dependency injection of Service interface 
	private Service theservice;
	
	//setter method
	public void setTheservice(Service theservice) {
		this.theservice = theservice;
	}
	
	//implementation methods
	@Override
	public String getDailyupdate() {
		return "Played the game for past two hours.";
	}
	
	@Override
	public String getDailyService() {
		return theservice.getDailyService();
	}

	

}
