package com.springDemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
	
	private String[] myFortunes = {"Fortune No.1","Fortune No.2","Fortune No.3"};

	@Override
	public String getFortune() {
		Random rand = new Random();
		int index = rand.nextInt(3);
		return myFortunes[index];
	}

}
