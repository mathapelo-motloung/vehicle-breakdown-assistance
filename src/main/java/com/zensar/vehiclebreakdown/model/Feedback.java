package com.zensar.vehiclebreakdown.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int feeback_id;
	private int user_id;
	private String description;
	private Date date;

	public Feedback() {
		// TODO Auto-generated constructor stub
	}
	
	public Feedback(int feeback_id, int user_id, String description, Date date) {
		super();
		this.feeback_id = feeback_id;
		this.user_id = user_id;
		this.description = description;
		this.date = date;
	}

	public int getFeeback_id() {
		return feeback_id;
	}

	public void setFeeback_id(int feeback_id) {
		this.feeback_id = feeback_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
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
	

}
