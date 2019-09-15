package com.pragim.flightreservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pragim.flightreservation.entity.User;
import com.pragim.flightreservation.repos.UserRepository;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	
		@GetMapping(value="/list")
		public List<User> getUserList(){
			
			return userRepository.findAll();
		}
		
		@GetMapping(value="/showReg")
		public String showRegPage(){
			return "registerUser";
		}
		
		@GetMapping(value="/showLogin")
		public String showLoginPage(){
			return "login/login";
		}
		
		@PostMapping("/register")
		public String registerUser(@ModelAttribute("user") User user){
			userRepository.save(user);
			return "login/login";
		}
		
		@PostMapping("/login")
		public String validateLogin(@RequestParam("email") String email, @RequestParam("password") String password, ModelMap modelMap){
			User user = userRepository.findByEmail(email);
			if(user!=null && user.getEmail().equalsIgnoreCase(email) && user.getPassword().equals(password))
				return "showFlights";
			else{
				modelMap.put("msg", "Invalid username or password!!! Please try again!!");
			}
						
			return "login/login";
		}

}
