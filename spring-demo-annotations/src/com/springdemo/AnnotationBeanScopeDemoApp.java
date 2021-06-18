package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		
		// load spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		ICoach coach = context.getBean("tennisCoach", ICoach.class);
		ICoach alphaCoach = context.getBean("tennisCoach", ICoach.class);
		
		
		// check if they are the same
		boolean result = (coach == alphaCoach);
		
		// print out the results
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for coach: " + coach);
		
		System.out.println("\nMemory location for coach: " + alphaCoach);
		
		
		// close the context
		context.close();
		
		
		
	}

}
