package com.vishu.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("databaseFortuneService")
	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println("default constructor");
	}
	
	//define init method
	@PostConstruct
	public void doMyStartUpStuff() {
		System.out.println("init method");
	}
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println("destroy method");
	}
	/*
	 * @Autowired public void doCrazyStuffs(FortuneService fortuneService) {
	 * System.out.println("Inside doCrazyStuffs"); this.fortuneService =
	 * fortuneService; }
	 */

	/*
	 * @Autowired public TennisCoach(FortuneService theFortuneService) {
	 * fortuneService=theFortuneService; }
	 */
	@Override
	public String getDailyWorkout() {

		return "practice tennis ";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
