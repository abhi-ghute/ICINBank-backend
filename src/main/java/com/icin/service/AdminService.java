package com.icin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icin.dto.Admin;
import com.icin.entity.AdminEntity;
import com.icin.repository.AdminRepo;

@Service
public class AdminService {

	@Autowired
	AdminRepo repo;
	
	public String login(Admin admin) {
		AdminEntity entity = repo.findByUserNameAndPassword(admin.getUserName(), admin.getPassword());
		if (entity!=null) {
			return "admin";
		}
		return "failure";
	}
}
