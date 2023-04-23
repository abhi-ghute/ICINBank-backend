package com.icin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.icin.entity.UserEntity;

@Repository
public interface UserRepo extends JpaRepository<UserEntity,Integer> {

	public UserEntity findByEmailAndPasswordAndStatus(String email, String password,String status);
	public List<UserEntity> findAllByStatus(String status);
}

