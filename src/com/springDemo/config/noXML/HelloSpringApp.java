package com.springDemo.config.noXML;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the context
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SprotsConfig.class);
		
		//retrieve the bean
		Coach theCoach = context.getBean("trackCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		TrackCoach trackCoach = context.getBean("trackCoach", TrackCoach.class);		//using trackCoach since showDetails() is not in Coach interface
		trackCoach.showDetails();
		
		//close the context
		context.close();
	}

}
