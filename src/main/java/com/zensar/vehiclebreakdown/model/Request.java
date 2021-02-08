package com.zensar.vehiclebreakdown.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="request")
@Table(name="request")
public class Request {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int request_id;
	private String description;
	private Date date;
	@Column(name="mechanic_id")
	private int mechanic_id;
	

	public Request() {
		
	}
	
	public Request(int request_id, String description, Date date, int mechanic_id) {
		super();
		this.request_id = request_id;
		this.description = description;
		this.date = date;
		this.mechanic_id = mechanic_id;
		
	}
	
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public int getMechanic_id() {
		return mechanic_id;
	}

	public void setMechanic_id(int mechanic_id) {
		this.mechanic_id = mechanic_id;
	}

	@Override
	public String toString() {
		return "Request [request_id=" + request_id + ", description=" + description + ", date=" + date
				+ ", mechanic_id=" + mechanic_id + "]";
	}
	
	
	
	
	 
}
