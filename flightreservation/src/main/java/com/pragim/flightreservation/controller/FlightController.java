package com.pragim.flightreservation.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pragim.flightreservation.entity.Flight;
import com.pragim.flightreservation.entity.User;
import com.pragim.flightreservation.repos.FlightRepository;

@Controller
@RequestMapping("/flight")
public class FlightController {
	
	@Autowired
	private FlightRepository flightRepository;
	
	@PostMapping("/searchFlights")
	public String searchFlights(@RequestParam("depatureCity") String depatureCity, @RequestParam("arrivalCity") String arrivalCity,@RequestParam("dateOfDepature")  @DateTimeFormat(pattern="dd-MMM-yy") Date dateOfDepature, ModelMap modelMap){
		List<Flight> findByDepatureCity = flightRepository.findByDepatureCity(depatureCity,arrivalCity,dateOfDepature);
		modelMap.addAttribute("flightList", findByDepatureCity);
		return "displayFlights";
	}
	
	@GetMapping("/showConfirmPage")
	public String registerUser(@RequestParam("fid") String fid, ModelMap modelMap){
		int id = Integer.parseInt(fid);
		Flight flight = flightRepository.findById(id);
		modelMap.addAttribute("flightObj", flight);
		return "confirmBooking";
	}

}
