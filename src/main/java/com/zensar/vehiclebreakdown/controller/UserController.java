package com.zensar.vehiclebreakdown.controller;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import com.zensar.vehiclebreakdown.model.User;
import com.zensar.vehiclebreakdown.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	public ResponseEntity<String> createUser(User user, HttpServletResponse response) throws IOException {
		userService.addUser(user);
		response.sendRedirect("/register");
		return new ResponseEntity<String>(HttpStatus.OK);
	}

}
