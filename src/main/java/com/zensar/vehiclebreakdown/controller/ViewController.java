package com.zensar.vehiclebreakdown.controller;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	
	@RequestMapping(value = "block", method = RequestMethod.POST)
	public String blockUser(@RequestParam(value="status",required=true) String status, 
			@RequestParam(value="id",required=true) int id) {
		
		User newUser = null;
		Optional<User> OpUser = null;
		User user =  null;
		
		if(status.length() == 6) {
			OpUser = userService.changeStatus(id); 
			newUser = new User(id, OpUser.get().getFname(), OpUser.get().getLname(), OpUser.get().getUsertype(),
				OpUser.get().getEmail(), OpUser.get().getCellno(), OpUser.get().getLocation(), OpUser.get().getUsername(),
				OpUser.get().getPassword(), "NOT BLOCKED"); // changing the status of mechanic manually
			user =  userService.saveUser(newUser); //saving the newly updated record
		}else if(status.length() == 7) {
			OpUser = userService.changeStatus(id); 
			newUser = new User(id, OpUser.get().getFname(), OpUser.get().getLname(), OpUser.get().getUsertype(),
				OpUser.get().getEmail(), OpUser.get().getCellno(), OpUser.get().getLocation(), OpUser.get().getUsername(),
				OpUser.get().getPassword(), "BLOCKED"); // changing the status of mechanic manually
			user =  userService.saveUser(newUser); //saving the newly updated record
		}
		return "viewuserform";
	}

}
