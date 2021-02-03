package com.zensar.vehiclebreakdown.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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


import com.zensar.vehiclebreakdown.model.Request;
import com.zensar.vehiclebreakdown.model.User;
import com.zensar.vehiclebreakdown.service.RequestService;
import com.zensar.vehiclebreakdown.service.UserService;
@Controller
public class RequestController {

	
	
	@Autowired
	RequestService requestService;
	//UserService userService;
	@GetMapping("/all")
	public String getRequests( HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		List<Request>request=requestService.getRequests();
		//List<User>theuser=userService.getAll();
		
		
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
}
