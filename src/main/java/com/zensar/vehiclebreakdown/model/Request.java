package com.zensar.vehiclebreakdown.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Entity
@Table(name="request")
public class Request {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int request_id;
	private int user_id;
	private String description;
	private Date date;

	@ManyToMany
	@JoinTable(name = "userrequest", joinColumns = {@JoinColumn(name = "rid")},inverseJoinColumns = {@JoinColumn(name="uid") })
	
	private List<User> users = new ArrayList<User>();
	
	public int getRequest_id() {
		return request_id;
	}
	public void setRequest_id(int request_id) {
		this.request_id = request_id;
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

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
}
