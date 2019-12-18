package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;

	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	// create a no-arg constructor
	public CricketCoach() {
		// TODO Auto-generated constructor stub
		System.out.println("CricketCoach: inside no-arg constructor");
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method - setEmailAddress ");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practise fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortun() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
