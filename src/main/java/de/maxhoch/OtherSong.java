package de.maxhoch;

public class OtherSong {
	
	public String getOthersong() {
		return othersong;
	}

	public void setOthersong(String othersong) {
		this.othersong = othersong;
	}

	private String othersong;
	
	@Override
	public String toString(){
		return othersong;
	}
}
