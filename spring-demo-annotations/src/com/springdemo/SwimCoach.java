package com.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements ICoach {
	
	private IFortuneService fortuneService;
	
	// will in inject the value into email field from properties file
	@Value("${anything.email}")
	private String email;
	
	@Value("${anything.team}")
	private String team;
	
	public SwimCoach(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters as a warm up";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	
	

}
