package com.zensar.vehiclebreakdown.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Department {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String name;
		
		@OneToMany
		//renaming the join table that will be generated
		@JoinTable(name = "tafula", joinColumns = {@JoinColumn(name = "depid")},inverseJoinColumns = {@JoinColumn(name="empid") })
		
		private List<Employee> employees = new ArrayList<Employee>();
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<Employee> getEmployees() {
			return employees;
		}
		public void setEmployees(List<Employee> employees) {
			this.employees = employees;
		}
		

}
