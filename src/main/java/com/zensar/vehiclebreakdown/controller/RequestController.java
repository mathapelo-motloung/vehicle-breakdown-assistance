package com.zensar.vehiclebreakdown.controller;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zensar.vehiclebreakdown.model.Request;
import com.zensar.vehiclebreakdown.model.User;
import com.zensar.vehiclebreakdown.service.RequestService;
import com.zensar.vehiclebreakdown.service.UserService;
@Controller
public class RequestController {

	
	
	@Autowired
	RequestService requestService;
	@Autowired
	UserService userService;
	@GetMapping("/allx")
	public String sendRequests( HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		List<User>users=requestService.allUsers();
		int id=4;
		User user=requestService.getUserById(id);
		User us=new User(user.getUser_id(),user.getFname(),user.getLname(),user.getUsertype(),user.getEmail(),
				user.getCellno(),user.getLocation(),user.getUsername(),user.getPassword(),user.getStatus());
		
		Request re=new Request();
		re.setUsers(us);
		System.out.println("*****************");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		   LocalDateTime now = LocalDateTime.now();
//		   System.out.println(dtf.format(now));
//		   System.out.println(now);
		String date=dtf.format(now);
		 System.out.println(date);
		
		
		
//		System.out.println(user.getFname());
		
		
		
		for(User u:users) {
			System.out.println(u.getEmail());
		}

		req.setAttribute("user", user);
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/requestform.jsp");
		rd.forward(req, resp);
		return "requestform";
		
	}
	
	@GetMapping("/all")
	public String getRequests( HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		List<Request>request=requestService.getRequests();
		int id=4;
//		int id=1;
		User user=requestService.getUserById(id);
		System.out.println(user.getFname());
		System.out.println("_____________________________________________________");
		List<User>users=requestService.allUsers();
		
		for(User u:users) {
			System.out.println(u.getEmail());
		}

//		for(Request y:request) {
//			if(y.getUser_id()==user.getUser_id()) {
//			System.out.println(y.getDescription());
//			System.out.println(user.getRequests());
//			}
			//System.out.println(y.getUsers());
//			
//		}
		
		req.setAttribute("requests", request);
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/viewrequest.jsp");
		rd.forward(req, resp);
		return "viewrequest";
		
	}
	
//	public ResponseEntity<String> makeRequest(Request request, HttpServletResponse response) throws IOException {
//		requestService.addRequest(request);
//		response.sendRedirect("/makerequest");
//		return new ResponseEntity<String>( HttpStatus.OK);
//	}

	
	@PostMapping("/addRequest")
	public ResponseEntity<String> createUser(@Valid Request request, BindingResult bindingResult,Model model,HttpServletResponse response) throws IOException {
		model.addAttribute("request",request);
		
		if (bindingResult.hasErrors()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
	               .body("All fields required.Make sure your input is valid.");
		}else {
			requestService.addRequest(request);
			return ResponseEntity.ok("Request made successful.");		
		}
	}	
}
