package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		ICoach coach = context.getBean("tennisCoach", ICoach.class);
		
		// call a method on the bean
		System.out.println(coach.getDailyWorkout());
		
		// close the context
		context.close();

	}

}
