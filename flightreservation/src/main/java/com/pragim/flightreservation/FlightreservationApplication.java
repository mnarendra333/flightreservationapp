package com.pragim.flightreservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class FlightreservationApplication extends org.springframework.boot.web.support.SpringBootServletInitializer{

	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(FlightreservationApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(FlightreservationApplication.class, args);
	}
	

}
