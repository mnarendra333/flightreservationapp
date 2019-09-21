package com.pragim.flightcheckin.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.pragim.flightcheckin.dto.ReservationUpdateRequest;
import com.pragim.flightcheckin.models.Reseravation;
@Component
public class FlightCheckInClientImpl implements FlightCheckInClient {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public Reseravation viewReservationData(long id) {
		Reseravation forObject = restTemplate.getForObject("http://localhost:9999/flightreservation/resdetails/"+id, Reseravation.class);
		return forObject;
	}

	@Override
	public Reseravation checkIn(ReservationUpdateRequest request) {
		Reseravation updatedObj = restTemplate.postForObject("http://localhost:9999/flightreservation/resdetails/update",request,Reseravation.class);
		return updatedObj;
	}

}
