package com.zensar.vehiclebreakdown.controller;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.zensar.vehiclebreakdown.dao.UserDao;
import com.zensar.vehiclebreakdown.model.User;
import com.zensar.vehiclebreakdown.service.UserService;

@Controller
public class ViewController {

	@Autowired
	UserService userService;

	@Autowired
	UserDao userDao;

	@PostMapping("filteruser")
	public String getUser(@RequestParam("user_type") String userType, HttpServletRequest req)
			throws URISyntaxException {
		List<User> user = null;
		HttpSession session = req.getSession();

		// getting records according the user_type value in the database
		if (userType.equalsIgnoreCase("ROLE_USER") || userType.equalsIgnoreCase("ROLE_MECHANIC")) {
			user = userService.getUserByRole(userType);
		} else if (userType.equalsIgnoreCase("all")) {
			user = userService.getAll();
		}
		
		session.setAttribute("user", user);
		return "viewuserform";
	}

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
		
		//check if current status of a mechanic is enable or disabled
		if(status.length() == 7) {
			
			//fetching the record from the db before updating it
			OpUser = userService.findUserById(id); 
			newUser = new User(id, OpUser.get().getFname(), OpUser.get().getLname(), OpUser.get().getUsertype(),
					OpUser.get().getEmail(), OpUser.get().getCellno(), OpUser.get().getLocation(), OpUser.get().getUsername(),
					OpUser.get().getPassword(), "NOT BLOCKED"); // changing the status of mechanic manually
			user =  userService.saveUser(newUser); //saving the newly updated record
		}
		 //check if current status of a mechanic is enable or disabled
		else if(status.length() == 8){
			OpUser2 = userService.findUserById(id); //fetching the record from the db before updating it
			newUser2 = new User(id, OpUser2.get().getFname(), OpUser2.get().getLname(), OpUser2.get().getUsertype(),
					OpUser2.get().getEmail(), OpUser2.get().getCellno(), OpUser2.get().getLocation(), OpUser2.get().getUsername(),
					OpUser2.get().getPassword(), "BLOCKED"); // changing the status of mechanic manually
			user2 =  userService.saveUser(newUser2); //saving the newly updated record
		}
		return "viewuserform";
	}

	}
