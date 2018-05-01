package demo.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(final String[] args) {

		//load spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//retrieve bean
		CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		//call methods
		System.out.println(theCoach.getdailyWorkout());
		
		System.out.println(theCoach.getdailyFortune());
		System.out.println(theCoach.getTeam());

		//close context
		context.close();
	}
}
