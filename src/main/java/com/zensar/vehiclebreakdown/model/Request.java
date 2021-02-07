package com.zensar.vehiclebreakdown.model;

import java.util.Date;

public class Request {
	
	private int requestId;
	private int userId;
	private String description;
	private Date date;
	
	public Request() {
	
	}

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public Request(int requestId, int userId, String description, Date date) {
		
		this.requestId = requestId;
		this.userId = userId;
		this.description = description;
		this.date = date;
	}
	
	
}
