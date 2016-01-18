package de.maxhoch;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Configuration
public class AnnotationConfiguration {

	@Bean
	public Performer duke15()
	{
		return new Juggler(100);
	}
	
	@Bean
	@Qualifier("ApplicationLogger")
	public Logger applicationLogger()
	{
		return LoggerFactory.getLogger(Application.class);
	}
}
