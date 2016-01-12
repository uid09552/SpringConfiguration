package de.maxhoch;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =
			    new ClassPathXmlApplicationContext("beans.xml");
		//Performer performer=(Performer) context.getBean("duke");
		//performer.perform();
		Performer performer2=(Performer) context.getBean("duke1");
		performer2.perform();
	System.out.println("Application started");
	Performer performer3=(Performer) context.getBean("poeticDuke");
	performer3.perform();
	Performer performer4=(Performer) context.getBean("kenny");
	performer4.perform();
	}

}
