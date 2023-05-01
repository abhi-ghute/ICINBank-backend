package com.icin.dto;

public class Checkbook {

	private String reason;
	private String pages;
	private Integer uid;
	private String status;
	
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getPages() {
		return pages;
	}
	public void setPages(String pages) {
		this.pages = pages;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Integer getUid() {
		return uid;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return status;
	}
}
