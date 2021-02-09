package com.zensar.vehiclebreakdown.dao;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.zensar.vehiclebreakdown.model.User;

@Repository
public interface UserDao extends CrudRepository<User, Integer> {
	
	public User findByUsername(String username);
	public User findByPassword(String password);
	public Optional<User> findById(int id);


	public List<User> findByUsertype(String role);

	public List<User> findByLocation(String location);
	
	String SELECT_BY_LOC_AND_ROLE = "select u FROM users u " + " WHERE u.location =:location AND u.usertype =:usertype";
	
	@Query(SELECT_BY_LOC_AND_ROLE)
	List<User> findByLocationRole(@Param("location") String location, @Param("usertype") String usertype);

}	

