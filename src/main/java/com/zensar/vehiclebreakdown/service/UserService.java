package com.zensar.vehiclebreakdown.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
	@PersistenceContext
    private EntityManager entityManager; 
	@Autowired
	UserDao userDao;
	
	 public List<User> find(int limit) {
	        return entityManager.createQuery("SELECT p FROM User p ORDER BY p.user_id",
	          User.class).setMaxResults(limit).getResultList();
	    }
	
	//Create new user
	public User addUser(@RequestBody User user) {
		return  userDao.save(user);
	}
	
	//Method that finds a record base on the attribute userType
	public List<User> getUserByRole(String role){
		return userDao.findByUsertype(role);	
	}
	

//	public List<User> getUserByName(String fname){
//		return userDao.findByFname(fname);
//	}

	//Get all users

	public List<User> getAll(){
		return (List<User>) userDao.findAll();
	}
	

//	public List<User> getById(int user_id) {
//		return userDao.findByuser(user_id);
//	}


	

	/*
	 * T Mkhari
	 * Method used to find mechanic for changing
	 * status from blocked to unblocked
	 */

	//Method used to find mechanic for changing status from blocked to unblocked

	public Optional<User> changeStatus(int id) {
		return userDao.findById(id);
	}
	
	//method used for saving changes after a mechani has been blocked or unblocked
	public User saveUser(User user) {
		return  userDao.save(user);
	}	


}
