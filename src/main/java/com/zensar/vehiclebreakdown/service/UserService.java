package com.zensar.vehiclebreakdown.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.zensar.vehiclebreakdown.dao.UserDao;
import com.zensar.vehiclebreakdown.model.User;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	public User addUser(@RequestBody User user) {
		return  userDao.save(user);
	}
	
	
	

	
}
