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
		// getting records according the user_type value in the database
		if(userType.equalsIgnoreCase("user") || userType.equalsIgnoreCase("mechanic")) { 
			user = userService.getUserByRole(userType); 
		}else if(userType.equalsIgnoreCase("all")) {
			 user = userService.getAll();
		}
		session.setAttribute("user", user);
		return "viewuserform";
	}

	
	/*
	 * T Mkhari
	 * This method changed the status of a mechanic from being block 
	 * to being unblocked, and its only accessible to the admin
	 */
	@RequestMapping(value = "/block", method = RequestMethod.POST)
	public String blockUser(@RequestParam(value="status",required=true) String status, HttpServletRequest req) {
	
	User newUser = null;
	User newUser2 = null;
	
	Optional<User> OpUser = null;	
	Optional<User> OpUser2 = null;
	
	User user =  null;
	User user2 =  null;
	
	HttpSession session = req.getSession();
	int id = Integer.parseInt(status.substring(status.length() - 1, status.length())); //get id when a mechanic is clicked
	
	if(status.length() == 7) //check if current status of a mechanic is enable or disabled
	{ 
		OpUser = userService.changeStatus(id); //fetching the record from the db before updating it
		newUser = new User(id, OpUser.get().getFname(), OpUser.get().getLname(), OpUser.get().getUsertype(),
				OpUser.get().getEmail(), OpUser.get().getCellno(), OpUser.get().getLocation(), OpUser.get().getUsername(),
				OpUser.get().getPassword(), "NOT BLOCKED"); // changing the status of mechanic manually
		user =  userService.saveUser(newUser); //saving the newly updated record
	}
	else if(status.length() == 8) //check if current status of a mechanic is enable or disabled
	{
		OpUser2 = userService.changeStatus(id); //fetching the record from the db before updating it
		newUser2 = new User(id, OpUser2.get().getFname(), OpUser2.get().getLname(), OpUser2.get().getUsertype(),
				OpUser2.get().getEmail(), OpUser2.get().getCellno(), OpUser2.get().getLocation(), OpUser2.get().getUsername(),
				OpUser2.get().getPassword(), "BLOCKED"); // changing the status of mechanic manually
		user2 =  userService.saveUser(newUser2); //saving the newly updated record
	}
	return "viewuserform";
	}
	
	

}
