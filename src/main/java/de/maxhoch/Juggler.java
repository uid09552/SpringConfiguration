package de.maxhoch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Juggler implements Performer {
	
	private int beanBags=3;
	public Juggler(){
		System.out.println("Juggler constructor called");
	}
	public Juggler(int beanBags)
	{
		this.beanBags=beanBags;
		//logger.info("int beans set");
	}
	public void perform() {
		System.out.println("Juggler constructor called");
		System.out.println("Juggling "+ beanBags+" BeanBags");
		
	}
	
}
