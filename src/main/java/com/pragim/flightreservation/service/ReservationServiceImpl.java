package com.pragim.flightreservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pragim.flightreservation.bean.ReservationRequest;
import com.pragim.flightreservation.entity.Flight;
import com.pragim.flightreservation.entity.Passenger;
import com.pragim.flightreservation.entity.Reseravation;
import com.pragim.flightreservation.repos.FlightRepository;
import com.pragim.flightreservation.repos.PassengerRepository;
import com.pragim.flightreservation.repos.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private ReservationRepository reservationRepository;
	
	@Autowired
	private PassengerRepository passengerRepository;
	
	@Autowired
	
	private FlightRepository flightRepository;
	
	@Override
	public String bookTicket(ReservationRequest request) {
		
		
		Reseravation reseravation = new Reseravation();
		
		
		int id = Integer.parseInt(request.getFid());
		Flight flight = flightRepository.findById(id);
		
	
		Passenger passenger = new Passenger();
		passenger.setFirstName(request.getFirstName());
		passenger.setLastName(request.getLastName());
		passenger.setMiddleName(request.getMiddleName());
		passenger.setEmail(request.getEmail());
		passenger.setMobileNo(request.getMobileNo());
		passengerRepository.save(passenger);
		reseravation.setFlight(flight);
		reseravation.setPassenger(passenger);
		
		Reseravation res = reservationRepository.save(reseravation);
		return "Flight booking completed successfully..and your Reservation id is "+res.getId();
	}

}
