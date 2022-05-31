package com.stgcodes.springdemo;

public class BasketballCoach implements Coach {
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	private String fortunes;

	//define a constructor for dependency injection
	public BasketballCoach() {
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public String getFortunes() {
		return fortunes;
	}

	@Override
	public String getDailyWorkout() {
		return "Shoot 30 baskets";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void setFortunes(String fortunes) {
		this.fortunes = fortunes;
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
}
