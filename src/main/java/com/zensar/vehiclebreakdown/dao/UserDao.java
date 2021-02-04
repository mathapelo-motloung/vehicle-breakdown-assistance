package com.zensar.vehiclebreakdown.dao;

import java.util.List;
import java.util.Optional;

<<<<<<< HEAD
import javax.persistence.EntityManager;

//import org.springframework.data.jpa.repository.Query;
=======
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaContext;
>>>>>>> 38ef8b7a8ddf9851ca64c971585cb0e78e90b2e3
import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.Nullable;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.zensar.vehiclebreakdown.model.User;

@Repository

public interface UserDao extends CrudRepository<User,Integer> {

	public List<User> findByUsertype(String role);	

public interface UserDao extends CrudRepository<User,Long> {

	public List<User> findByUsertype(String role);
<<<<<<< HEAD
//	 @Nullable
//	public List<User>  findByuser(int user_id);
//	@Query("select u from User u where u.user_id = ?1")
//	User getUserById( int user_id);
//		
	
	
=======
		

>>>>>>> 38ef8b7a8ddf9851ca64c971585cb0e78e90b2e3
}

