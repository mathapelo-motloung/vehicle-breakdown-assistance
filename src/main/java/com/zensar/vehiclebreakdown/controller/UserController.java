package com.zensar.vehiclebreakdown.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.zensar.vehiclebreakdown.model.User;
import com.zensar.vehiclebreakdown.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;


	@PostMapping("/adduser")
	public ResponseEntity<String> createUser(@Valid User user, BindingResult bindingResult,Model model,HttpServletResponse response) throws IOException {
		model.addAttribute("user",user);
		
		if (bindingResult.hasErrors()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
	               .body("All fields required.Make sure your input is valid.");
		}else {
			userService.addUser(user);
			return ResponseEntity.ok("Registration successful.");		
		}
	}	

}
