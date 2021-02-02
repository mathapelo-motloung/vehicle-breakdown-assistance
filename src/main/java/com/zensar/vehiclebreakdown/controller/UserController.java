package com.zensar.vehiclebreakdown.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.zensar.vehiclebreakdown.model.Employee;
import com.zensar.vehiclebreakdown.model.User;
import com.zensar.vehiclebreakdown.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("employeeForm", "employee", new Employee());
    }

//    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
//    public String submit(@Valid @ModelAttribute("employee")Employee employee, 
//      BindingResult result, ModelMap model) {
//        if (result.hasErrors()) {
//            return "employeeForm";
//        }
//       
//        return "employeeView";
//    }
    
//    @RequestMapping(value = "/adduser", method = RequestMethod.POST)
//    public String submituser(@Valid @ModelAttribute("user")User user, 
//      BindingResult result, ModelMap model) {
//        if (result.hasErrors()) {
//            return "error";
//        }
//        model.addAttribute("name", user.getFname());
//       
//        return "employeeView";
//    }
//	
	
	@PostMapping("/adduser")
	public ResponseEntity<String> createUser (@Valid @ModelAttribute User user, HttpServletResponse response, BindingResult bindingResult) {
		 
		if (bindingResult.hasErrors()) {
			System.out.println(bindingResult);
		}
		try {
			userService.addUser(user);
			response.sendRedirect("/register");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	
	
	
	public ResponseEntity<String> createUser(User user, HttpServletResponse response) throws IOException {
		userService.addUser(user);
		response.sendRedirect("/register");
		return new ResponseEntity<String>( HttpStatus.OK);
	}	
}
