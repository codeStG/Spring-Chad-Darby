package com.stgcodes.springdemo.xmlconfig;

public class BaseballCoach implements Coach {

	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//add an init method to be executed at bean creation
	public void initializeBean() {
		System.out.println("BaseballCoach: inside method initializeBean");
	}
	
	//add a destroy method to be executed at bean destruction
	public void destroyBean() {
		System.out.println("BaseballCoach: inside method destroyBean");
	}
	
}
