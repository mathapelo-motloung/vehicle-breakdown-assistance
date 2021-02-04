package com.zensar.vehiclebreakdown.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zensar.vehiclebreakdown.model.User;
@Repository
public interface customizedDao {

	public List<User> findById(int id);
	public void listEmployeesEntity();
}
