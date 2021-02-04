package com.zensar.vehiclebreakdown.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import java.util.Optional;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

	
	
	
	@RequestMapping(value = "/block", method = RequestMethod.POST)
	public String blockUser(@RequestParam(value="thabo",required=true) String thabo, HttpServletRequest req, 
			@RequestParam("myValue")String[] myVal) {
		
		String n[] = req.getParameterValues("myValue");
		System.out.println("ON GOD: " + n);
		for (String string : n) {
			System.out.println("Hello hi"+string);
		}
		
		
		
	Optional<User> user = null;	
	User user2 =  null;
	HttpSession session = req.getSession();
	System.out.println("%%: " + thabo);
	String name = thabo.substring(0, 6);
	System.out.println("substring: " + thabo.length());
	
	if(thabo.length() == 7) {
		System.out.println("enabled");
		user = userService.changeStatus(3);
		System.out.println("////////////////" + user.get().getFname());
		User newUser = new User(3, user.get().getFname(), user.get().getLname(), user.get().getUsertype(),
				user.get().getEmail(), user.get().getCellno(), user.get().getLocation(), user.get().getUsername(),
				user.get().getPassword(), "NOT BLOCKED");
		
		user2 =  userService.addUser(newUser);
		
		
		System.out.println("////////////////" + newUser);
	}else if(thabo.length() == 8) {
		System.out.println("disabled");
	}
	
	
	return "viewuserform";
	}
	
	

}
