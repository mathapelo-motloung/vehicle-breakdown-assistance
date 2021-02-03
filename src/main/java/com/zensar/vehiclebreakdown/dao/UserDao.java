package com.zensar.vehiclebreakdown.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaContext;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zensar.vehiclebreakdown.model.User;

@Repository
public interface UserDao extends CrudRepository<User,Integer> {

	public List<User> findByUsertype(String role);

//	public List<User> findAllById(int id);
	
	// public User findById(int id);
		
}
