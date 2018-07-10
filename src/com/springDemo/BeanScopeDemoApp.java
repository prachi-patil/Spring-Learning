package com.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		//load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve beans from spring container
		Coach coach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//compare if they are same
		boolean flag = (coach == alphaCoach);
		System.out.println("\nsingleton : "+flag);
		System.out.println("memory for coach : "+coach.toString());
		System.out.println("memory for aplhaCoach : "+alphaCoach.toString());
		
		//close context
		context.close();
		
	}

}
