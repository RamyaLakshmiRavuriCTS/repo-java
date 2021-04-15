package com.assignmentweek4.springwithxml;

public class CricketCoach implements Coach {

		private FortuneService fortuneService;
		private String emailAddress;
		private String team;
		
		
		public String getEmailAddress() {
			return emailAddress;
		}

		public void setEmailAddress(String emailAddress) {
			System.out.println("Setting emial Address");
			this.emailAddress = emailAddress;
		}

		public String getTeam() {
			return team;
		}

		public void setTeam(String team) {
			System.out.println("Setting Team");
			this.team = team;
		}

		public CricketCoach() {
			System.out.println("Cricket no Arg constructor");
	}
	
		public void setFortuneService(FortuneService thefortuneService) {
			System.out.println("Cricket inside Setter Method");

			fortuneService = thefortuneService;
		}
		@Override
		public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice for spin today";
	}

		@Override
		public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Cricket coach : "+ fortuneService.getFortune() ;
	}

}
