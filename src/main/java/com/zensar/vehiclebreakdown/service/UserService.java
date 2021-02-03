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
	
	
	public List<User> getUserByRole(String role){
		return userDao.findByUsertype(role);
	}
	
	public List<User> getAll(){
		return (List<User>) userDao.findAll();
	}
	
	public Optional<User> getById(int id) {
		return userDao.findById(id);
	}
}
