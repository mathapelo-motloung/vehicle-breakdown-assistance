package com.zensar.vehiclebreakdown.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zensar.vehiclebreakdown.model.Feedback;

@Repository
public interface FeedbackDao  extends CrudRepository<Feedback,Integer>{

}
