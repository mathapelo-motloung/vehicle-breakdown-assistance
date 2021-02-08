package com.zensar.vehiclebreakdown.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.zensar.vehiclebreakdown.model.Request;

public interface RequestDao extends CrudRepository<Request,Integer>{
	
	String SELECT_BY_ID = "select u FROM request u " + " WHERE u.mechanic_id =:mechanic_id";
	
  @Query(SELECT_BY_ID)
   List<Request> findByRequest(@Param("mechanic_id") int mechanicId);
   
  
		
   
}

