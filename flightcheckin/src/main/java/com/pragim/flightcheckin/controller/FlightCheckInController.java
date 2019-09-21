package com.pragim.flightcheckin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pragim.flightcheckin.client.FlightCheckInClient;
import com.pragim.flightcheckin.dto.ReservationUpdateRequest;
import com.pragim.flightcheckin.models.Reseravation;

@Controller
public class FlightCheckInController {

	
	@Autowired
	private FlightCheckInClient client;
	
	@RequestMapping(value="/showCheckIn")
	public String showCheckIn(){
		
		return "showCheckInPage";
	}
	
	
	
	@RequestMapping(value="/showresdet")
	public String getReserDetails(@RequestParam("id") String id, ModelMap model){
		long idVal = Integer.parseInt(id);
		Reseravation viewReservationData = client.viewReservationData(idVal);
		model.addAttribute("reservation", viewReservationData);
		return "displayResDetails";
	}
	
	
	@PostMapping(value="/checkin")
	public String getReserDetails(@ModelAttribute("reservationUpdateRequest") ReservationUpdateRequest request){
		Reseravation viewReservationData = client.checkIn(request);
		return "confirmCheckIn";
	}
	
}
