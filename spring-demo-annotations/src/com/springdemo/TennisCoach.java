package com.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
//@Scope("prototype")
public class TennisCoach implements ICoach {
	
	
	@Autowired
	@Qualifier("randomFortuneService")
	private IFortuneService fortuneService;
	
	// define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	
	// define my init method
	// call/execute after constructor and dependency injections
	@PostConstruct
	public void doMyStartUpStuff() {
		System.out.println(">> TennisCoach: inside of doMyStartUpStuff");		
	}
	
	// define my destroy method
	// execute before bean is destroyed
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: inside of doMyCleanupStuff");		
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
		
		return fortuneService.getFortune();
		
	}

}
