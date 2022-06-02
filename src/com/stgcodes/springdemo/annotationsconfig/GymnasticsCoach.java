package com.stgcodes.springdemo.annotationsconfig;

import org.springframework.stereotype.Component;

@Component
public class GymnasticsCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Do 20 somersaults";
	}

}
