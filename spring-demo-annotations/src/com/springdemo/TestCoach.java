package com.springdemo;

import org.springframework.stereotype.Component;

@Component
public class TestCoach implements ITestCoach {

	@Override
	public void testWorkout() {
		System.out.println("inside test coach method");
	}

}
