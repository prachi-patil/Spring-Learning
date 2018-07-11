package com.springDemo.pureXMLConfig;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		System.out.println("Cricket constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket setter method");
		this.fortuneService = fortuneService;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 mins";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	
	public void showDetails() {
		System.out.println("My email is : "+emailAddress);
		System.out.println("I represent "+team);
	}

}
