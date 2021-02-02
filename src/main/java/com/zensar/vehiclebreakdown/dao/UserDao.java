package com.zensar.vehiclebreakdown.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.zensar.vehiclebreakdown.model.User;

@Repository
public interface UserDao extends CrudRepository<User, Long> {

	
	public User findByUsername(@Param("username") String username);

	public User findByPassword(@Param("password") String password);

}
