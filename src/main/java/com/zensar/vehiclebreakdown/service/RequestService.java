package com.zensar.vehiclebreakdown.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.vehiclebreakdown.dao.RequestDao;
import com.zensar.vehiclebreakdown.model.Request;

@Service
public class RequestService {

	@Autowired
	RequestDao requestDao;
	
	public List<Request> getRequest(int mechanicId) {
		
		return requestDao.findByRequest(mechanicId);
		
	}
}
