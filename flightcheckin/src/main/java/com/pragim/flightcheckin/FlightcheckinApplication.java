package com.pragim.flightcheckin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;




@SpringBootApplication
public class FlightcheckinApplication extends SpringBootServletInitializer{

	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(FlightcheckinApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(FlightcheckinApplication.class, args);
	}

}
