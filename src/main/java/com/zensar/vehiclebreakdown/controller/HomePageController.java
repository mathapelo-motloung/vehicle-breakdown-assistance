package com.zensar.vehiclebreakdown.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomePageController {
	
	@GetMapping("/home")
	public String getIndex() {
		return "index";
	}
	
	@GetMapping("/register")
	public String getRegisterForm() {
		return "registerform";
	}
	
	@GetMapping("/login")
	public String getLoginForm() {
		return "loginform";
	}
}
