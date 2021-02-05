package com.zensar.vehiclebreakdown.dao;


import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.zensar.vehiclebreakdown.model.User;

@Repository
public interface UserDao extends CrudRepository<User, Integer> {
	
	public User findByUsername(String username);
	public User findByPassword(String password);
	public List<User> findByUsertype(String role);
	public List<User> findByLocation(String location);
}	


