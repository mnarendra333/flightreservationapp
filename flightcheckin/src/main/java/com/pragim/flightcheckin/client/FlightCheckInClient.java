package com.pragim.flightcheckin.client;

import com.pragim.flightcheckin.dto.ReservationUpdateRequest;
import com.pragim.flightcheckin.models.Reseravation;

public interface FlightCheckInClient {
	
	
	public Reseravation viewReservationData(long id);
	
	public Reseravation checkIn(ReservationUpdateRequest request);

}
