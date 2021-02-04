package com.zensar.vehiclebreakdown.dao;

import java.util.List;
import java.util.Optional;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaContext;
import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.Nullable;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.zensar.vehiclebreakdown.model.User;

@Repository

public interface UserDao extends CrudRepository<User,Integer> {
	
	public List<User> findByUsertype(String role);	


//	 @Nullable
//	public List<User>  findByuser(int user_id);
//	@Query("select u from User u where u.user_id = ?1")
//	User getUserById( int user_id);
//		
	
	
}

