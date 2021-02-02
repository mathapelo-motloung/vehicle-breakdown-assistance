package com.zensar.vehiclebreakdown.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.vehiclebreakdown.model.User;
import com.zensar.vehiclebreakdown.service.UserService;

@Controller
public class ViewController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/filteruser")
	public String getUser(@RequestParam("user_type") String userType, HttpServletRequest req) throws URISyntaxException{
		List<User> user = null;
		HttpSession session = req.getSession();
		if(userType.equalsIgnoreCase("user") || userType.equalsIgnoreCase("mechanic")) {
			user = userService.getUserByRole(userType);
		}else if(userType.equalsIgnoreCase("all")) {
			 user = userService.getAll();
		}
		session.setAttribute("user", user);
		return "viewuserform";
	}
}
