package com.zensar.vehiclebreakdown.dao;

import org.springframework.data.repository.CrudRepository;

import com.zensar.vehiclebreakdown.model.Feedback;


public interface FeedbackDao  extends CrudRepository<Feedback,Integer>{

	

}
