package com.zensar.vehiclebreakdown.model;

import javax.persistence.Column;
<<<<<<< HEAD
=======
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Cacheable;
>>>>>>> db16d066e4e20781159bf021897ce179085fa0cb
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

<<<<<<< HEAD
=======


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.JoinColumn;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Cache;
>>>>>>> db16d066e4e20781159bf021897ce179085fa0cb

@Entity(name = "users")
@Table(name="users")

public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	
	@NotEmpty
	private String fname;
	
	@NotEmpty
	private String lname;

	@Column(name="usertype")
	private String usertype;


	@NotEmpty
	private String email;
	
	@NotEmpty
	private String cellno;
	
	@NotEmpty
	private String location;
	
	@NotEmpty
	private String username;
	
	@NotEmpty
	private String password;

	private String status;
<<<<<<< HEAD
=======

	
	@OneToMany
	private List<Feedback> feedbackMessages = new ArrayList<Feedback>();
>>>>>>> db16d066e4e20781159bf021897ce179085fa0cb

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int user_id, String fname, String lname, String usertype, String email, String cellno, String location,
			String username, String password, String status) {
		super();
		this.user_id = user_id;
		this.fname = fname;
		this.lname = lname;
		this.usertype = usertype;
		this.email = email;
		this.cellno = cellno;
		this.location = location;
		this.username = username;
		this.password = password;
		this.status = status;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

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

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", fname=" + fname + ", lname=" + lname + ", usertype=" + usertype
				+ ", email=" + email + ", cellno=" + cellno + ", location=" + location + ", username=" + username
				+ ", password=" + password + ", status=" + status + "]";
	}

}
