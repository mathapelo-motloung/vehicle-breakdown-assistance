package com.zensar.vehiclebreakdown.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.zensar.vehiclebreakdown.model.Feedback;


public interface FeedbackDao  extends CrudRepository<Feedback,Integer>{

}
