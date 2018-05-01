package demo.spring;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	public BaseballCoach() {};
	
	public BaseballCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}
	
	public String getdailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	public String getdailyFortune() {
		
		//use my fortuneService
		
		return fortuneService.getFortune();

	}
}
