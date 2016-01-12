package de.maxhoch;

public class Instrumentalist {
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
	}
	public String screamSong(){
		return song;
	}
	
	@SuppressWarnings("unused")
	private Instrument instrument;
	
	public void setInstrument(Instrument instrument)
	{
		this.instrument=instrument;
	}
	
}
