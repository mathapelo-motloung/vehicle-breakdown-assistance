package com.zensar.vehiclebreakdown.controller;
import java.io.IOException;
import java.rmi.ServerException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

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
import com.zensar.vehiclebreakdown.dao.UserDao;
import com.zensar.vehiclebreakdown.model.Feedback;
import com.zensar.vehiclebreakdown.model.User;
import com.zensar.vehiclebreakdown.service.FeedbackService;


@Controller
public class FeedbackController {
	
	@Autowired
	FeedbackService feedbackservice;
	
	@Autowired
	UserDao userDao;
	
	@GetMapping("/feedback")
	public String getFeedbackForm(Model model) {
		Feedback f = new Feedback();
		model.addAttribute("feedback", f);
		return "feedbackform";
	}
	
	
	@PostMapping("/sendfeedback")
	public ResponseEntity<String> saveFeedback(@Valid Feedback feedback,Model model,BindingResult bindingResult, HttpServletRequest req){
		model.addAttribute("feedback",feedback);
		
		if (bindingResult.hasErrors()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
	               .body("All fields required.Make sure your input is valid.");
		}else {
			HttpSession session = req.getSession();
			User user = (User) session.getAttribute("userSession");
			
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	        LocalDateTime now = LocalDateTime.now();
			String date=dtf.format(now);
			
			feedback.setDate(date);
			feedback.setUser(user);
			
			feedbackservice.addFeedback(feedback);
			return ResponseEntity.ok("Feedback added successfully");
		}
	}

	
	//This method list all feedback from users
	@GetMapping("/feedback/all")
	public  ResponseEntity<Feedback> getFeedback(HttpServletRequest req, HttpServletResponse resp){
		List<Feedback> list= feedbackservice.getFeedback();
		req.setAttribute("feedback", list);
		
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/viewfeedbackform.jsp");
		try {
			rd.forward(req, resp);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ResponseEntity<Feedback>(HttpStatus.OK);
	}
}
