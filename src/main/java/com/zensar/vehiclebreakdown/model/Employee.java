package com.zensar.vehiclebreakdown.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	
    @NotEmpty
	@Size(min=2, max=30)
	private String fname;
	
	@NotEmpty
	@Size(min=2, max=30)
	private String lname;
	
	//@NotEmpty
	private String user_type;
	
	@NotEmpty
	@Email
	private String email;
	
	@NotEmpty
	private String cellno;
	
	@NotEmpty
	private String location;
	
	@NotEmpty
	private String username;
	
	@NotEmpty
	private String password;
	
    
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCellno() {
		return cellno;
	}
	public void setCellno(String cellno) {
		this.cellno = cellno;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
    
    
}
