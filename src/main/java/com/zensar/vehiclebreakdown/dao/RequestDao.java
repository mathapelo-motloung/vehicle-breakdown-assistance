package com.zensar.vehiclebreakdown.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zensar.vehiclebreakdown.model.Request;
	@Repository
	public interface RequestDao extends CrudRepository<Request, Integer>{


}
