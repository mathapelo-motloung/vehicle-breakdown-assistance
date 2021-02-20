package com.zensar.vehiclebreakdown.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.zensar.vehiclebreakdown.dao.RequestDao;
import com.zensar.vehiclebreakdown.model.Request;
import com.zensar.vehiclebreakdown.model.User;

import org.springframework.web.bind.annotation.RequestBody;


@Service
public class RequestService {

	@Autowired
	RequestDao requestDao;
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Request> getRequest(int mechanicId) {

		return requestDao.findByRequest(mechanicId);
	}

	public Request addRequest(Request request) {
		return requestDao.save(request);
	}

	public List<Request> getRequests() {
		return (List<Request>) requestDao.findAll();
	}

	public Request makeRequest(@RequestBody Request req) {
		return requestDao.save(req);

	}
	
	public String getClientReq(HttpServletRequest req) {
		
		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("userSession");
		int userId =user.getUser_id();
		Object params[] = { userId };
		String sql ="SELECT request.request_id, request.description, request.date\r\n"
				+ "FROM request\r\n"
				+ "INNER JOIN request_users ON request.request_id=request_users.request_id\r\n"
				+ "WHERE request_users.user_id =?";
		
		List<Request> clientRequest= jdbcTemplate.query(sql, new BeanPropertyRowMapper<Request>(Request.class),params);
		session.setAttribute("clientRequest", clientRequest);
		return "viewclientrequest";

	}
	
}
