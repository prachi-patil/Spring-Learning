package com.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDependencyDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		theCoach.showDetails();
		context.close();
		
	}

}
