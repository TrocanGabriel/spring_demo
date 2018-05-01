package demo.spring;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String[] fortunes = {"Fortune 1", "Fortune 2", "Fortune 3"};
	private Random random = new Random();
	public String getFortune() {
		
		int index = random.nextInt(fortunes.length);
		return fortunes[index];
	}
}
