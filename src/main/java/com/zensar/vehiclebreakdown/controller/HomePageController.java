package com.zensar.vehiclebreakdown.controller;
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
	UserDao userDao;
	
	@Autowired
	UserService userService;

	@GetMapping("/home")
	public String getIndex() {
		return "index";
	}

	@GetMapping("/register")
	public String getRegisterForm(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "registerform";
	}


	@GetMapping("/viewuser")
	public String getUsers(HttpServletRequest req) {
		 HttpSession session=req.getSession();
		 List<User> user = userService.getAll();
		 session.setAttribute("user", user);
		return "viewuserform";
	}

	@GetMapping("/searchlocation")
	public String getMechanic(HttpServletRequest req) {
		String role = "ROLE_MECHANIC";
		 HttpSession session=req.getSession();
		 List<User> user = userService.getUserByRole(role);
		 session.setAttribute("user", user);
		return "searchlocationform";
	}

	@GetMapping("/logout")
	public String getLogoutForm(HttpServletRequest req) {
		HttpSession session = req.getSession();
	      if(session != null) {
	          session.invalidate();
	      }
		return "index";
	}
	
	@GetMapping("/login")
	public String getLoginForm() {
		return "loginform";
	}
	//2
	@PostMapping("/login.do")
	public String loginUser(@RequestParam("username") String username, @RequestParam("password") String password,
			HttpServletRequest req) {
		
		HttpSession session=req.getSession();
		
		try {
			User userSession = userDao.findByUsername(username);
			User userStatus = userDao.findByStatus(password, username);
			if (username.equals(userSession.getUsername()) && userStatus.getStatus().equalsIgnoreCase("NOT BLOCKED")) {
				if(password.equals(userSession.getPassword())) {
						session.setAttribute("userSession", userSession);
						session.setAttribute("sessionName", username);
						session.setMaxInactiveInterval(900);
						return "home";	
				}else {
					return "loginform";
				}
			} else {
				return "loginform";
			}
		}catch (Exception e) {
			System.out.println("User could not be identified: "+ e);
		}
		return "loginform";
	}
	
	@GetMapping("/viewrequest")
	public String requests() {
		return "viewrequest";
	}
}
