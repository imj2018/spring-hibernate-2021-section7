package com.springdemo;

import org.springframework.stereotype.Component;

@Component
public class UnhappyFortuneService implements IFortuneService {

	@Override
	public String getFortune() {
		return "Today will not be a good day!";
	}

}
