package com.icin.dto;

public class Transaction {

	private Integer uid;
	private String primaryAccountNumber;
	private String secondaryAccountNumber;
	private Long amount;
	private String refrenceNumber;
	private String description;
	
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
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
}
