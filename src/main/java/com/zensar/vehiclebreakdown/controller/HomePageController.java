package com.zensar.vehiclebreakdown.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomePageController {
	
	@GetMapping("/home")
	public String getIndex() {
		return "index";
	}
	
	@PreAuthorize("hasAnyRole('ROLE_ADMIN')")
	@GetMapping("/register/all")
	public String getRegisterForm() {
		return "registerform";
	}
	
	
	@GetMapping("/login/all")
	public String getLoginForm() {
		return "loginform";
	}
}
