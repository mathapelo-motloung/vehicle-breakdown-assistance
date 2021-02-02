package com.zensar.vehiclebreakdown.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.zensar.vehiclebreakdown.model.User;
import com.zensar.vehiclebreakdown.service.UserService;

@Controller
public class HomePageController {
	@Autowired
	UserService userService;
	
	@GetMapping("/home")
	public String getIndex() {
		return "index";
	}
	
	@PreAuthorize("hasAnyRole('ROLE_ADMIN')")
	@GetMapping("/register/all")
	public String getRegisterForm() {
		return "registerform";
	}
	
	@GetMapping("/viewuser")
	public String getUsers(HttpServletRequest req) {
		 HttpSession session=req.getSession();
		 List<User> user = userService.getAll();
		 session.setAttribute("user", user);
		return "viewuserform";
	
	}
	
	@GetMapping("/login/all")
	public String getLoginForm() {
		return "loginform";
	}
}
