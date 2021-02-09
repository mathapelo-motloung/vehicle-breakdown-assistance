package com.zensar.vehiclebreakdown.model;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Entity(name="request")
@Table(name="request")
public class Request {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int request_id;
	@NotEmpty
	private String description;
	
	private String date;
	
	private int mechanic_id;
	
	
	@ManyToMany
	@JoinTable(name = "request_users", joinColumns = { @JoinColumn(name = "request_id", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "user_id", nullable = false, updatable = false) })
	private List<User> users = new ArrayList<User>();
	

	public int getRequest_id() {
		return request_id;
	}
	public void setRequest_id(int request_id) {
		this.request_id = request_id;
	}
	
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
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
	public Request(@NotEmpty int request_id, @NotEmpty String description, @NotEmpty String date,
			@NotEmpty int mechanic_id, List<User> users) {
		super();
		this.request_id = request_id;
		this.description = description;
		this.date = date;
		this.mechanic_id = mechanic_id;
		this.users = users;
	}
	public Request() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	
}
