package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// default bean id tennisCoach, same name as the class lower case first character
@Component
public class TennisCoach implements ICoach {
	
	
	// although private it will resolve the dependency and set the field behind the scenes
	// it construct the class then inject into TennisCoach using reflection
	@Autowired
	private IFortuneService unhappyFortuneService;
	
	// define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	
	/*
	// any method for injection (dependency injection)
	@Autowired
	public void doSomeCrazyStuff(IFortuneService unhappyFortuneService) {
		
		System.out.println(">> TennisCoach: inside doSomeCrazyStuff method");
		this.unhappyFortuneService = unhappyFortuneService;
	
	}*/
	
	
	/*
	// spring will scan for components implementing the interface IFortuneService
	// an instance of UnhappyFortuneService is created then injected into TennisCoach
	@Autowired
	public TennisCoach(IFortuneService unhappyFortuneService) {
		
		this.unhappyFortuneService = unhappyFortuneService;
		
	}*/
	

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}
	
	@Override
	public String getDailyFortune() {
		
		return unhappyFortuneService.getFortune();
		
	}

}
