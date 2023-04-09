package com.icin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icin.dto.User;
import com.icin.dto.UserLogin;
import com.icin.service.UserService;

@RestController
@RequestMapping("user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	@Autowired
	UserService service;
	
	@PostMapping("create")
	public String saveUser(@RequestBody User user) {
		return service.saveUser(user);
	}
	
	@PostMapping("login")
	public String checkUser(@RequestBody UserLogin login) {
		return service.checkUser(login);
	}
}
