package com.springDemo.config.noXML;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.springDemo.config.noXML")		//optional
@PropertySource("classpath:sport.properties")
public class SprotsConfig {	
	
	@Bean
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}

	@Bean
	public Coach trackCoach(FortuneService fortuneService) {				//method name = bean Id
		TrackCoach myTrackCoach = new TrackCoach(happyFortuneService());
		return myTrackCoach;
	}
}
