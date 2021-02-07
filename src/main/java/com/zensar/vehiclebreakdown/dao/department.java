package com.zensar.vehiclebreakdown.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.vehiclebreakdown.model.Department;
import com.zensar.vehiclebreakdown.model.Employee;


	public interface department extends JpaRepository<Department, Integer>{

//		Department save(Department dep);

	}
