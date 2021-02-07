package com.zensar.vehiclebreakdown.controller;

import java.net.URISyntaxException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.zensar.vehiclebreakdown.dao.UserDao;
import com.zensar.vehiclebreakdown.model.User;
import com.zensar.vehiclebreakdown.service.UserService;

@Controller
public class SearchController {
	
	@Autowired
	UserService userService;

	@Autowired
	UserDao userDao;

	@PostMapping("filtersearch")
	public String getMechanic(@RequestParam("location") String location, HttpServletRequest req) {
		List<User> user = null;
		String role = "ROLE_MECHANIC";

		HttpSession session = req.getSession();
		user = userService.getMechanicByLocation(location);
		session.setAttribute("user", user);
		return "searchlocationform";
	}
}
