package demo.spring;

import java.util.ArrayList;
import java.util.List;

public class CricketCoach implements Coach {

private FortuneService fortuneService;
private String emailAdress;
private String team;

public String getEmailAdress() {
	return emailAdress;
}

public String getTeam() {
	return team;
}

public void setEmailAdress(String emailAdress) {
	System.out.println("CricketCoach- inside setEmailAdress");
	this.emailAdress = emailAdress;
}

public void setTeam(String team) {
	System.out.println("CricketCoach- inside setTeam");
	this.team = team;
}


	
	public CricketCoach() {};
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach- inside setFortuneService");
		 this.fortuneService = fortuneService;
	}
	
	public String getdailyWorkout() {
		return "Spend 30 minutes on fast bowling";
	}

	public String getdailyFortune() {
		
		//use my fortuneService
	
 		return fortuneService.getFortune();

	}
}
