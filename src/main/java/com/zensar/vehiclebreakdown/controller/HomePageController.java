package com.zensar.vehiclebreakdown.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
	@GetMapping("/register")
	public String getRegisterForm(Model model) {
		User user = new User();
		model.addAttribute("user",user);
		return "registerform";
	}
	@GetMapping("/makerequest")
	public String request() {
		return "requestform";
	}
	@GetMapping("/viewrequest")
	public String requests() {
		return "viewrequest";}
	
	
	
	@GetMapping("/viewuser")
	public String getUsers(HttpServletRequest req) {
		 HttpSession session=req.getSession();
		 List<User> user = userService.getAll();
		 session.setAttribute("user", user);
		return "viewuserform";
	}
	
	@GetMapping("/login")
	public String getLoginForm() {
		return "loginform";
	}
}
