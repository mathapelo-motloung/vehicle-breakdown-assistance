package com.zensar.vehiclebreakdown.service;

import java.util.ArrayList;
import java.util.List;

import java.util.Optional;


import org.hibernate.annotations.SqlFragmentAlias;
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
	/*
	 * T Mkhari
	 * Method that finds a record base on the attribute userType
	 */
	public List<User> getUserByRole(String role){
		return userDao.findByUsertype(role);
		
	}
	

	public List<User> getUserByRole(String role){
		return userDao.findByUsertype(role);
	}
	

	public List<User> getAll(){
		return (List<User>) userDao.findAll();
	}
	

	/*
	 * T Mkhari
	 * Method used to find mechanic for changing
	 * status from blocked to unblocked
	 */
	public Optional<User> changeStatus(int id) {
		return userDao.findById(id);
	}
	
	/*
	 * T Mkhari
	 * method used for saving changes after a mechanic
	 * has been blocked or unblocked
	 */
	public User saveUser(User user) {
		return  userDao.save(user);
	}	

}
