package com.zensar.vehiclebreakdown.controller;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
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
	@GetMapping("/all")
	public String getRequests( HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		List<Request>request=requestService.getRequests();
		int id=4;
//		List<User>user=userService.find(id);
		
//		for(User u:user) {
//			System.out.println(u.getEmail());
//		}
//		Optional<User> user= userService.getById(id);
//		System.out.println(user);
		//List<User>theuser=userService.getAll();
	//		
	//		List<User> user=userService.getAll();
	//		for(User u:user) {
	//			//System.out.println(u.getEmail());
	//		}
		for(Request y:request) {
			
			System.out.println(y.getDescription());
			//System.out.println(y.getUsers());
//			for (User user : theuser) {
//				if(y.getUser_id()==user.getUser_id()) {
//				
//				System.out.println("-----> " + user.getFname() +  " : "  + user.getCellno() + " : " + user.getLocation());
//				}
//				}
		}
		
		req.setAttribute("requests", request);
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/viewrequest.jsp");
		rd.forward(req, resp);
		return "viewrequest";
		
	}
	
	public ResponseEntity<String> makeRequest(Request request, HttpServletResponse response) throws IOException {
		requestService.addRequest(request);
		response.sendRedirect("/makerequest");
		return new ResponseEntity<String>( HttpStatus.OK);
	}
//	@PostMapping("/user")
//	public String getUser(@RequestParam("fname") String fname, HttpServletRequest req) throws URISyntaxException{
//		List<User> user = null;
//		HttpSession session = req.getSession();
//		if(fname.equalsIgnoreCase("Success") || fname.equalsIgnoreCase("success")) {
//			user = userService.getUserByName(fname);
//		
//		}
//		session.setAttribute("user", user);
//		//System.out.println(user);
//		return "viewrequest";
//	}
	
//	@GetMapping(path="/alls")
//	public User getUserById(){
//		//int user_id=1;
//		User user=userService.getById(4);
//		System.out.println(user);
//		return user;
//	}
}
