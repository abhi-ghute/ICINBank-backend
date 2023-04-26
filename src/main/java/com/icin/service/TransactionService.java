package com.icin.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icin.dto.Transaction;
import com.icin.entity.TransactionEntity;
import com.icin.entity.UserEntity;
import com.icin.repository.TransactionRepo;
import com.icin.repository.UserRepo;

import jakarta.transaction.Transactional;

@Service
public class TransactionService {

	@Autowired
	TransactionRepo repo;
	
	@Autowired
	UserRepo userRepo;
	
	@Transactional
	public String deposit(Transaction transaction) {
		
		TransactionEntity entity = new TransactionEntity();
		UserEntity user = userRepo.findById(transaction.getUid()).get();
		
		user.setAccountBalance(transaction.getAmount()+user.getAccountBalance());
		
		BeanUtils.copyProperties(transaction, entity);
		
		entity = repo.save(entity);
		if(entity!=null) {
			userRepo.save(user);
			return "success";
		}
				
		return "failed";
	}
	
	public String withdrawal(Transaction transaction) {
		TransactionEntity entity = new TransactionEntity();
		UserEntity user = userRepo.findById(transaction.getUid()).get();
		
		if(transaction.getAmount()>user.getAccountBalance()) {
			return "lowBal";
		}
		user.setAccountBalance(user.getAccountBalance()-transaction.getAmount());
		
		BeanUtils.copyProperties(transaction, entity);
		
		entity = repo.save(entity);
		if(entity!=null) {
			userRepo.save(user);
			return "success";
		}
				
		return "failed";
	}
	
	public String transfer(Transaction transaction) {
		return "";
	}
}
