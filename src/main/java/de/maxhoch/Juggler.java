package de.maxhoch;

public class Juggler implements Performer {
	private int beanBags=3;
	public Juggler(){
		System.out.println("Juggler constructor called");
	}
	public Juggler(int beanBags)
	{
		this.beanBags=beanBags;
	}
	public void perform() {
		System.out.println("Juggler constructor called");
		System.out.println("Juggling "+ beanBags+" BeanBags");
		
	}
	
}
