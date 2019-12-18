package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

	// Define a private field for the dependency

	private FortuneService fortuneService;

	// Define a constructor for dependency Injection
	public BaseballCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}

	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practise";
	}

	@Override
	public String getDailyFortun() {
		// use the fortune service to get a fortune
		
		return fortuneService.getFortune();
	}
}
