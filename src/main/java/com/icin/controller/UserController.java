package com.icin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.icin.dto.Checkbook;
import com.icin.dto.User;
import com.icin.dto.UserLogin;
import com.icin.entity.UserEntity;
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
	
	@GetMapping("getAll")
	public List<UserEntity> getAll(@RequestParam String status) {
		return service.getAll(status);
	}
	
	@GetMapping("getUser")
	public UserEntity getUser(@RequestParam Integer id) {
		return service.getUser(id);
	}
	
	@PostMapping("checkRequest")
	public String checkRequest(@RequestBody Checkbook checkbook) {
		return service.checkRequest(checkbook);
	}
}
