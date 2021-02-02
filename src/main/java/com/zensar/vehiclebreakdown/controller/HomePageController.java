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
	public String register() {
		return "registerform";
	}
	@GetMapping("/makerequest")
	public String request() {
		return "requestform";
	}
	@GetMapping("/viewrequest")
	public String requests() {
		return "viewrequest";
	}
}
