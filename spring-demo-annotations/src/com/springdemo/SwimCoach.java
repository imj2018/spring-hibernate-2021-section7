package com.springdemo;

public class SwimCoach implements ICoach {
	
	private IFortuneService fortuneService;
	
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

}
