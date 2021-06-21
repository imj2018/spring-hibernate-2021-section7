package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		// calling the method Bean method name
		// not part of ICoach interface so using SwimCoach
		SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);
		
		// call a method on the bean
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getDailyFortune());
		
		// call our new swim coach methods ... has the props values injected
		System.out.println("email: " + coach.getEmail());
		System.out.println("team: " + coach.getTeam());	
		
		// close the context
		context.close();

	}

}
