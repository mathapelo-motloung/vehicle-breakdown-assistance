
package com.zensar.vehiclebreakdown.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.zensar.vehiclebreakdown.service.UserService;

@Controller
public class RequestController {

	@Autowired
	UserService userService;
	
	@GetMapping("/sentRequest")
	public String getIndex() {
		return "sentrequestform";
	}
}
