package com.zensar.vehiclebreakdown.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.zensar.vehiclebreakdown.model.Feedback;
import com.zensar.vehiclebreakdown.service.FeedbackService;

@Controller
public class FeedbackController {
	
	@Autowired
	FeedbackService feedbackservice;
	
	@PostMapping("/sendfeedback")
	public ResponseEntity<String> saveFeedback(Feedback feedback){
		feedbackservice.addFeedback(feedback);
		return ResponseEntity.ok("Feedback added successfully");
	}

}
