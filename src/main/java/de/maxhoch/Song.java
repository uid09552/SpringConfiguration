package de.maxhoch;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("song")
public class Song {

	private final String song ="I sing a song";
	
	@Override
	public String toString()
	{
		return song;
	}
}
