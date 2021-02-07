package com.zensar.vehiclebreakdown.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.vehiclebreakdown.model.Department;
import com.zensar.vehiclebreakdown.model.Employee;
import com.zensar.vehiclebreakdown.model.User;
@Repository
public interface customizedDao extends JpaRepository<User, Integer>{

//	Employee save(Employee emp, Department dep);

}

