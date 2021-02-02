package com.zensar.vehiclebreakdown.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.zensar.vehiclebreakdown.dao.RequestDao;
import com.zensar.vehiclebreakdown.model.Request;
import com.zensar.vehiclebreakdown.model.User;

@Service
public class RequestService {

	@Autowired
	RequestDao requestDao;
	
	public List<Request> getRequests() {

		return (List<Request>) requestDao.findAll();
	}
}
