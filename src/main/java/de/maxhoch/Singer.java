package de.maxhoch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Singer implements Performer {

	@Autowired
	@Qualifier("song")
	private Song song;
	
	@Autowired
	@Qualifier("nochasong")
	private OtherSong nochasong;
	
	@Autowired
	@Qualifier("othersong")
	private OtherSong othersong;
	public void perform() {
		System.out.println(song.toString()+ "  "+othersong.toString()+ "   "+nochasong.toString());
		
	}

	
}
