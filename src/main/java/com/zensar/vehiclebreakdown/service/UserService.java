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
	
	//add user
	public User saveUser(@RequestBody User user) {
		return userDao.save(user);
	}
		
	public List<User> getUserByLocRole(String location,String role){
		return userDao.findByLocationRole(location, role);
	}
	
	public User getStatus(String password, String username) {
		return userDao.findByStatus(password, username);
	}

}
