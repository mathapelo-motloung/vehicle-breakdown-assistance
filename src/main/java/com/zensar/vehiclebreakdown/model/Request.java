package com.zensar.vehiclebreakdown.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity(name="request")
@Table(name="request")
public class Request {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int request_id;
	private String description;
	private String date;
	
	private int mechanic_id;
	

	public int getRequest_id() {
		return request_id;
	}
	public void setRequest_id(int request_id) {
		this.request_id = request_id;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	public int getMechanic_id() {
		return mechanic_id;
	}
	public void setMechanic_id(int mechanic_id) {
		this.mechanic_id = mechanic_id;
	}
	
	

	
}
