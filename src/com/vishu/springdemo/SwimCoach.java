package com.vishu.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
 private FortuneService fortuneService;
 
 @Value("${foo.email}")
 private String mail;
 
 public String getMail() {
	return mail;
}
public String getTeam() {
	return team;
}

@Value("${foo.team}")
 private String team;
 public SwimCoach(FortuneService theFortuneService) {
	 fortuneService=theFortuneService;
 }
	@Override
	public String getDailyWorkout() {
		
		return "swim 100 meters daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
