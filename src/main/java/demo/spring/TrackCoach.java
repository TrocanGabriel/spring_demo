package demo.spring;

public class TrackCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	public String getdailyWorkout() {
		return "Run 5km around the field";
	}

	public String getdailyFortune() {
		return fortuneService.getFortune();
	}

}
