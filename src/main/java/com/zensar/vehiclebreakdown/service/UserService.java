package com.zensar.vehiclebreakdown.service;

import java.util.List;

import java.util.Optional;

import org.hibernate.annotations.SqlFragmentAlias;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import com.zensar.vehiclebreakdown.dao.UserDao;
import com.zensar.vehiclebreakdown.model.User;

@Service
public class UserService {

	@Autowired
	UserDao userDao;

	//Create new user
	public User addUser(@RequestBody User user) {
		return userDao.save(user);
	}

	
	public List<User> getMechanicByLocation(String location) {
		return userDao.findByLocation(location);
	}

	//Method that finds a record base on the attribute userType
	public List<User> getUserByRole(String role){
		return userDao.findByUsertype(role);	
	}
	
	//Get all users
	public List<User> getAll(){
		return (List<User>) userDao.findAll();
	}
	
	//Find user by id
	public Optional<User> findUserById(int id) {
		return userDao.findById(id);

	}

	//method used for saving changes after a mechanic has been blocked or unblocked
	public User saveUser(User user) {
		return userDao.save(user);
	}
	
	public List<User> getUserByLocRole(String location, String role){
		
		return userDao.findByLocationRole(location, role);
	}
	


}
