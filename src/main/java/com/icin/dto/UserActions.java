package com.icin.dto;

public class UserActions {

	private Integer uid;
	private boolean deposit=false;
	private boolean withdrawal=false;
	private boolean transfer=false;
	
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Integer getUid() {
		return uid;
	}
	public boolean isDeposit() {
		return deposit;
	}
	public void setDeposit(boolean deposit) {
		this.deposit = deposit;
	}
	public boolean isWithdrawal() {
		return withdrawal;
	}
	public void setWithdrawal(boolean withdrawal) {
		this.withdrawal = withdrawal;
	}
	public boolean isTransfer() {
		return transfer;
	}
	public void setTransfer(boolean transfer) {
		this.transfer = transfer;
	}
}
