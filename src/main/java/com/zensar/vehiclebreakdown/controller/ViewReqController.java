package com.zensar.vehiclebreakdown.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.zensar.vehiclebreakdown.model.Request;
import com.zensar.vehiclebreakdown.model.User;
import com.zensar.vehiclebreakdown.service.RequestService;

@Controller
public class ViewReqController {

	@Autowired
	RequestService requestService;
	
	@GetMapping("/filterrequest")
	public String getMechanicReq(HttpServletRequest req) {
		
		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("userSession");
	    int userId = user.getUser_id();
	    List<Request> request =	requestService.getRequest(userId);
	    session.setAttribute("request", request);		
	    
		return "viewrequest";
	}
}
