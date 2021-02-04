package com.zensar.vehiclebreakdown.model;

import java.sql.Date;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Cache;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int feeback_id;
	private String description;
	
	
	public Feedback() {
		// TODO Auto-generated constructor stub
	}
	
	public Feedback(int feeback_id,  String description, Date date) {
		super();
		this.feeback_id = feeback_id;
		this.description = description;
		
	}

	public int getFeeback_id() {
		return feeback_id;
	}

	public void setFeeback_id(int feeback_id) {
		this.feeback_id = feeback_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

//	public Date getDate() {
//		return date;
//	}
//
//	public void setDate(Date date) {
//		this.date = date;
//	}
//	

}
