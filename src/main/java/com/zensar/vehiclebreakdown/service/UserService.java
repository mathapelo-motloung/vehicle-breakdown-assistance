package com.zensar.vehiclebreakdown.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
	
	public User addUser(@RequestBody User user) {
		return  userDao.save(user);
	}
	
	
	public List<User> getUserByRole(String role){
		return userDao.findByUsertype(role);
	}
	
//	public List<User> getUserByName(String fname){
//		return userDao.findByFname(fname);
//	}
	public List<User> getAll(){
		return (List<User>) userDao.findAll();
	}
	
//	public List<User> getById(int user_id) {
//		return userDao.findByuser(user_id);
//	}


	public Optional<User> changeStatus(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
