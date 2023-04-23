package com.icin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icin.dto.Transaction;
import com.icin.service.TransactionService;

@RestController
@RequestMapping("transaction")
@CrossOrigin(origins = "http://localhost:4200")
public class TransactionController {

	@Autowired
	TransactionService service;
	
	@PostMapping("deposit")
	public String deposit(@RequestBody Transaction transaction) {
		return service.deposit();
	}
	
	@PostMapping("withdrawal")
	public String withdrawal(@RequestBody Transaction transaction) {
		return service.withdrawal();
	}
	
	@PostMapping("transfer")
	public String transfer(@RequestBody Transaction transaction) {
		return service.transfer();
	}
}
