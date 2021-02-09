package com.zensar.vehiclebreakdown.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.vehiclebreakdown.dao.RequestDao;
import com.zensar.vehiclebreakdown.model.Request;

import org.springframework.web.bind.annotation.RequestBody;


@Service
public class RequestService {

	@Autowired
	RequestDao requestDao;

	public List<Request> getRequest(int mechanicId) {

		return requestDao.findByRequest(mechanicId);
	}

	public Request addRequest(Request request) {
		return requestDao.save(request);
	}

	public List<Request> getRequests() {
		return (List<Request>) requestDao.findAll();
	}

	public Request makeRequest(@RequestBody Request req) {
		return requestDao.save(req);

	}
	
}
