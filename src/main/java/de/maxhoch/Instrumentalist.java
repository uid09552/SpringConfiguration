package de.maxhoch;

public class Instrumentalist implements Performer {
	public Instrumentalist() {
		
	}
	private String song;
	
	public void setSong(String song)
	{
		this.song=song;
	}
	public String getSong()
	{
		return this.song;
	}
	public void perform() 
	{
		System.out.println("Playing " + song);
		//instrument.play();
	}
	public String screamSong(){
		return song;
	}
	
	private int age;
	public void setAge(int age)
	{
		this.age=age;
	}
	private Instrument instrument;
	
	public void setInstrument(Instrument instrument)
	{
		this.instrument=instrument;
	}
	
}
