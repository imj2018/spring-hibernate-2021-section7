package com.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements IFortuneService {
	
	// create an array of strings
	private String[] data = {
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	// create a random number generators
	private Random random = new Random();
	
	
	
	@Override
	public String getFortune() {
		// pick a random string from the array
		
		int index = random.nextInt(data.length);
		
		String fortune = data[index];
		
		return fortune;
	}

}
