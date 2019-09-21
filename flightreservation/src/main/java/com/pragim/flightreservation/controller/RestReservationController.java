package com.pragim.flightreservation.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pragim.flightreservation.dto.ReservationUpdateRequest;
import com.pragim.flightreservation.entity.Reseravation;
import com.pragim.flightreservation.repos.ReservationRepository;
@RestController
@CrossOrigin
public class RestReservationController {
	
	
	@Autowired
	private ReservationRepository reservationRepository;
	
	
	@RequestMapping("/resdetails/{id}")
	public Reseravation getReservationDetails(@PathVariable("id") Long id){
		return reservationRepository.findOne(id);
	}
	
	
	@RequestMapping(value="/resdetails/update",method=RequestMethod.POST)
	public Reseravation checkIn(@RequestBody ReservationUpdateRequest request){
		Reseravation reservation = reservationRepository.findOne(request.getId());
		if(request.isCheckedIn())
			reservation.setCheckedIn(1);
		
		reservation.setNumberOfBags(request.getNoOfBags());
		return reservationRepository.save(reservation);
			
	}
	

}
