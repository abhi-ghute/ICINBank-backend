package com.icin.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="transactions")
public class TransactionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer uid;
	private String primaryAccountNumber;
	private String secondaryAccountNumber;
	private Long amount;
	private String refrenceNumber;
	private String description;
	private String holderName;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getPrimaryAccountNumber() {
		return primaryAccountNumber;
	}
	public void setPrimaryAccountNumber(String primaryAccountNumber) {
		this.primaryAccountNumber = primaryAccountNumber;
	}
	public String getSecondaryAccountNumber() {
		return secondaryAccountNumber;
	}
	public void setSecondaryAccountNumber(String secondaryAccountNumber) {
		this.secondaryAccountNumber = secondaryAccountNumber;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public String getRefrenceNumber() {
		return refrenceNumber;
	}
	public void setRefrenceNumber(String refrenceNumber) {
		this.refrenceNumber = refrenceNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public String getHolderName() {
		return holderName;
	}
}
