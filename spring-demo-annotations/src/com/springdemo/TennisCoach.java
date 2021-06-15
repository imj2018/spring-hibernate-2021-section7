package com.springdemo;

import org.springframework.stereotype.Component;

// the bean id is sillyCoach, it is automatically registered no XML
@Component("sillyCoach")
public class TennisCoach implements ICoach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
