package com.zensar.vehiclebreakdown.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.zensar.vehiclebreakdown.dao.FeedbackDao;
import com.zensar.vehiclebreakdown.model.Feedback;


@Service
public class FeedbackService {
	@Autowired
	FeedbackDao feedBackDao;
	
	public Feedback addFeedback(@RequestBody Feedback feedback){
		return feedBackDao.save(feedback);
	}
	

}
