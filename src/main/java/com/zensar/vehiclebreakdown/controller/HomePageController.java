package com.zensar.vehiclebreakdown.controller;


import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.zensar.vehiclebreakdown.dao.UserDao;
import com.zensar.vehiclebreakdown.model.User;
import com.zensar.vehiclebreakdown.service.UserService;

@Controller
public class HomePageController {
	@Autowired
	UserService userService;

	@Autowired
	UserDao userDao;

	@GetMapping("/home")
	public String getIndex() {
		return "index";
	}

	@GetMapping("/register/all")
	public String getRegisterForm(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "registerform";
	}
	
	//This method populate the page with all user on the db
	@GetMapping("/feedback")
	public String getFeedbackForm() {
		return "feedbackform";
	}
	
	@GetMapping("/viewuser")
	public String getUsers(HttpServletRequest req) {
	@GetMapping("/user/searchlocation")
	public String getMechanic(HttpServletRequest req) {
		String role = "ROLE_MECHANIC";
		 HttpSession session=req.getSession();
		 List<User> user = userService.getUserByRole(role);
		 session.setAttribute("user", user);
		return "searchlocationform";
	
	}

	/*
	 * T Mkhari This method populate the page with all user on the db
	 */
	
	@GetMapping("/admin/viewuser")
	public String getUsers(HttpServletRequest req) {
		HttpSession session = req.getSession();
		List<User> user = userService.getAll();
		session.setAttribute("user", user);
		return "viewuserform";
	}

	@GetMapping("/login/all")
	public String getLoginForm() {
		return "loginform";
	}

	

}
