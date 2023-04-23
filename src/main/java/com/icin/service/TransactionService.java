package com.icin.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icin.dto.Transaction;
import com.icin.entity.TransactionEntity;
import com.icin.entity.UserEntity;
import com.icin.repository.TransactionRepo;

@Service
public class TransactionService {

	@Autowired
	TransactionRepo repo;
	
	public String deposit(Transaction transaction) {
		
		TransactionEntity entity = new TransactionEntity();
		UserEntity user = 
		
		BeanUtils.copyProperties(transaction, entity);
		
		entity = repo.save(entity);
		if(entity!=null) {
			return "success";
		}
				
		return "failed";
	}
	
	public String withdrawal(Transaction transaction) {
		return "";
	}
	
	public String transfer(Transaction transaction) {
		return "";
	}
}
