package com.stgcodes.springdemo.annotationsconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	private FortuneService fortuneService;
	
	public TennisCoach() {
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	//setter injection example
//	@Autowired
//	public void triggerDependencyInjection(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
}
