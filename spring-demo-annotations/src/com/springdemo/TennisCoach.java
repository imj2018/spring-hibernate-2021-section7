package com.springdemo;

import org.springframework.stereotype.Component;

// default bean id tennisCoach, same name as the class lower case first character
@Component
public class TennisCoach implements ICoach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
