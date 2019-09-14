package com.pragim.flightreservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pragim.flightreservation.entity.User;
import com.pragim.flightreservation.repos.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	
		@GetMapping(value="/userlist")
		public List<User> getUserList(){
			
			return userRepository.findAll();
		}

}
