package de.maxhoch;

import org.springframework.context.annotation.*;

@Configuration
public class AnnotationConfiguration {

	@Bean
	public Performer duke15()
	{
		return new Juggler(100);
	}
}
