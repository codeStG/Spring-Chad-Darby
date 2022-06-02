package com.stgcodes.springdemo.annotationsconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GymnasticsCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired
	public GymnasticsCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Do 20 somersaults";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
