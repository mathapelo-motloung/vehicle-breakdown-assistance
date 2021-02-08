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
	
	@GetMapping("/makerequest")
	public String sendRequests(){
		return "requestform";
		
	}
	
	@GetMapping("/all")
	public String getRequests( HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		List<Request>request=requestService.getRequests();
		
		req.setAttribute("requests", request);
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/viewrequest.jsp");
		rd.forward(req, resp);
		return "viewrequest";
		
	}
	

	
	@PostMapping("/addRequest")
	public ResponseEntity<String> createRequest(@Valid Request request, BindingResult bindingResult,Model model,HttpServletRequest req) throws IOException {
		 
		if (bindingResult.hasErrors()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
	               .body("All fields required.Make sure your input is valid.");
		}else {
			
			HttpSession session = req.getSession();
			//User user = (User) session.getAttribute("userSession");
		
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	        LocalDateTime now = LocalDateTime.now();
			String date=dtf.format(now);
			
			request.setDate(date);
			//request.setUsers(user);
			
			requestService.addRequest(request);
			return ResponseEntity.ok("Request made successful.");		
		}
	}	
}
