package com.icin.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icin.dto.User;
import com.icin.dto.UserLogin;
import com.icin.entity.UserActionEntity;
import com.icin.entity.UserEntity;
import com.icin.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo repo;
	
	public String saveUser(User user) {
		
		UserEntity entity = new UserEntity();
		BeanUtils.copyProperties(user, entity);
		
		entity.setActionEntity(new UserActionEntity());
		
		entity = repo.save(entity);
		
		if(entity != null)
			return "Success";
		return "failure";
	}
	
	public String checkUser(UserLogin login) {
		UserEntity entity = repo.findByEmailAndPassword(login.getEmail(), login.getPassword());
		return entity.toString();
	}
	
	public List<UserEntity> getAll(){
		return repo.findAll();
	}
}
