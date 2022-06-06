package com.stgcodes.springdemo.annotationsconfig;

public class JavaCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public JavaCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Do some coding exercises";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
