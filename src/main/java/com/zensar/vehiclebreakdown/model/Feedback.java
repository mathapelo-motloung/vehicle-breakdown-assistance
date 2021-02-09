package com.zensar.vehiclebreakdown.model;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Cache;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int feeback_id;
	@NotBlank
	private String description;
	private String date;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	public Feedback() {
		// TODO Auto-generated constructor stub
	}
	
	public Feedback(int feeback_id,  String description, String date) {
		super();
		this.feeback_id = feeback_id;
		this.description = description;
		this.date= date;
	}
	
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	@Override
	public String toString() {
		return "Feedback [feeback_id=" + feeback_id + ", description=" + description + ", date=" + date + ", user="
				+ user + "]";
	}
	
	

}
