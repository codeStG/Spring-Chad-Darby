package com.stgcodes.springdemo.annotationsconfig;

import org.springframework.stereotype.Component;

@Component("coach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
