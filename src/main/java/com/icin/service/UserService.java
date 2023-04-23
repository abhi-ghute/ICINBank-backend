package com.icin.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icin.dto.User;
import com.icin.dto.UserLogin;
import com.icin.entity.UserActionEntity;
import com.icin.entity.UserEntity;
import com.icin.repository.UserRepo;

import jakarta.transaction.Transactional;

@Service
public class UserService {

	@Autowired
	UserRepo repo;

	public String saveUser(User user) {

		UserEntity entity = new UserEntity();
		BeanUtils.copyProperties(user, entity);

		entity.setActionEntity(new UserActionEntity());

		entity = repo.save(entity);

		if (entity != null)
			return "Success";
		return "failure";
	}

	public String checkUser(UserLogin login) {
		UserEntity entity = repo.findByEmailAndPasswordAndStatus(login.getEmail(), login.getPassword(),"Activated");
		if (entity!=null) {
			return entity.getId().toString();
		}else {
			entity = repo.findByEmailAndPasswordAndStatus(login.getEmail(), login.getPassword(),"Disabled");
			if (entity!=null) {
				return "Disabled";
			}
			else {
				entity = repo.findByEmailAndPasswordAndStatus(login.getEmail(), login.getPassword(),"Blocked");
				if (entity!=null) {
					return "Blocked";
				}
			}
		}
		
		return "failure";
	}

	public List<UserEntity> getAll(String status) {
		List<UserEntity> entityList = repo.findAllByStatus(status);

		return entityList;
	}

	@Transactional
	public String authorize(UserEntity entity) {
		UserEntity DbEntity = repo.findById(entity.getId()).get();
		
		DbEntity.setActionEntity(entity.getActionEntity());
		DbEntity.setStatus("Activated");
		
		
		DbEntity = repo.save(DbEntity);
		
		if(DbEntity != null)
			return "Success";
		return "failure";
	}
	
	@Transactional
	public String block(UserEntity entity) {
		UserEntity DbEntity = repo.findById(entity.getId()).get();

		DbEntity.setStatus("Blocked");
		
		DbEntity = repo.save(DbEntity);
		
		if(DbEntity != null)
			return "Success";
		return "failure";
	}
	
	@Transactional
	public String unblock(UserEntity entity) {
		UserEntity DbEntity = repo.findById(entity.getId()).get();
		
		System.out.println(entity.getFirstName());
		DbEntity.setStatus("Activated");
		
		DbEntity = repo.save(DbEntity);
		
		if(DbEntity != null)
			return "Success";
		return "failure";
	}
	
	public UserEntity getUser(Integer id) {
		return repo.findById(id).get();
	}
}
