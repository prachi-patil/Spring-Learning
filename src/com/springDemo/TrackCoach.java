package com.springDemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 10 mins Running";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public void myInit() {
		System.out.println("This is my Init method");
	}
	
	public void myDestroy() {
		System.out.println("This is my Destroy method");
	}

}
