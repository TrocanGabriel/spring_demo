package demo.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		//call method on bean
		System.out.println(theCoach.getdailyWorkout());
		
		System.out.println(theCoach.getdailyFortune());
		// close the context
		context.close();
	}

}
