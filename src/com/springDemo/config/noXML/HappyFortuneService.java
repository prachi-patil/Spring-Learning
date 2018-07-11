package com.springDemo.config.noXML;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Have a Happy Day !!!";
	}

}
