package com.zensar.vehiclebreakdown.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		model.addAttribute("user",user);
		return "registerform";
	}
	

	/*
	 * T Mkhari
	 * This method populate the page with all user on the db
	 */
	@PreAuthorize("hasAnyRole('ROLE_ADMIN')")
	@GetMapping("/admin/viewuser")
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
	
	
	@PostMapping("/login.do")
	public String loginUser(@RequestParam("username") String username, HttpServletRequest req) {
		User user = userDao.findByUsername(username);

		if (username.equals(user.getUsername())) {
	     System.out.println("access granted");
			return "Access Granted";
		} else {
			return "Wrong Username or password";
		}

	}

	


}
