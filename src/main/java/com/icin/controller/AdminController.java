package com.icin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icin.dto.Admin;
import com.icin.dto.User;
import com.icin.entity.UserEntity;
import com.icin.service.AdminService;
import com.icin.service.UserService;

@RestController
@RequestMapping("admin")
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {

	@Autowired
	AdminService service;
	
	@Autowired
	UserService userService;
	
	@PostMapping("login")
	public String login(@RequestBody Admin admin) {
		return service.login(admin);
	}
	
	@PostMapping("authorize")
	public String authorize(@RequestBody UserEntity entity)
	{
		return userService.authorize(entity);
	}
	
	@PostMapping("block")
	public String block(@RequestBody UserEntity entity)
	{
		return userService.block(entity);
	}
	
	@PostMapping("unblock")
	public String unblock(@RequestBody UserEntity entity)
	{
		return userService.unblock(entity);
	}
}
