package com.springDemo.config.noXML;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("theCoach")
@Component		//default beanId will be trackCoach
//@Scope("singleton")		//default scope
@Scope("prototype")
public class TrackCoach implements Coach {

	@Autowired				//field dependency Injection through annotation - makes use of reflection
	@Qualifier("happyFortuneService")		//helps resolve injection if multiple impl. of Fortune Service exist
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String emailAddress;
	@Value("${foo.team}")
	private String team;
	
	public TrackCoach() {
		
	}
	
	//@Autowired			//constructor dependency Injection through Annotation
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
//	@Autowired			//constructor dependency Injection through Annotation
//	public TrackCoach(@Qualifier("happyFortuneService")FortuneService theFortuneService) {		//constructor DI with @Qualifier
//		fortuneService = theFortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 10 mins Running";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	@PostConstruct
	public void myInit() {
		System.out.println("This is my Init method");
	}
	
	@PreDestroy
	public void myDestroy() {
		System.out.println("This is my Destroy method");
	}

//	@Autowired			//setter dependency injection through annotation
//	public void setFortuneService(FortuneService myFortuneService) {
//		this.fortuneService = myFortuneService;
//	}
	
	//@Autowired			//method dependency injection through annotation
	public void someDummyMethodName(FortuneService myFortuneService) {
		this.fortuneService = myFortuneService;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void showDetails() {
		System.out.println("My email is : "+emailAddress);
		System.out.println("I represent "+team);
	}
}
