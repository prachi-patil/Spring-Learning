package com.springDemo.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation-applicationContext.xml");
		
		//retrieve bean from container
		//Coach theCoach = context.getBean("theCoach", Coach.class);
		
		//retrieving bean through default beanId
		Coach theCoach = context.getBean("trackCoach", Coach.class);
		
		//call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		//working through Autowiring
		System.out.println(theCoach.getDailyFortune());
		
		//bean scopes
		Coach alphaCoach = context.getBean("trackCoach", Coach.class);
		
		System.out.println("singleton ? -> "+(theCoach == alphaCoach));
		System.out.println("theCoach : "+theCoach);
		System.out.println("alphaCoach : "+alphaCoach);
		
		//close the context
		context.close();
	}

}
