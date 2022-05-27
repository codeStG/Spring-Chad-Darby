package com.stgcodes.springdemo;

public class BasketballCoach implements Coach {
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BasketballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Shoot 30 baskets";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
