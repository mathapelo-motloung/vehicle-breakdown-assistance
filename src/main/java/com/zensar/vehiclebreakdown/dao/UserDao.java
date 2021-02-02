package com.zensar.vehiclebreakdown.dao;


import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.zensar.vehiclebreakdown.model.User;

@Repository
public interface UserDao extends CrudRepository<User, Long> {

	
	public User findByUsername(@Param("username") String username);

	public User findByPassword(@Param("password") String password);


	public List<User> findByUsertype(String role);
		

}
