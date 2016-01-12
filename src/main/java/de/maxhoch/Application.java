package de.maxhoch;

import java.io.Console;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =
			    new ClassPathXmlApplicationContext("beans.xml");
		Performer performer=(Performer) context.getBean("duke");
		performer.perform();
	System.out.println("Application started");
	}

}
