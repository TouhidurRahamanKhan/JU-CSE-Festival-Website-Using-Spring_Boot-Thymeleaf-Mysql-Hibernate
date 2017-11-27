package com.touhid.app.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RubiksCubeCompetition {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String batch;
	private String department;
	private String userName;
	private String tShirtSize;
	private String email;
	private String mobileNumber;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String gettShirtSize() {
		return tShirtSize;
	}
	public void settShirtSize(String tShirtSize) {
		this.tShirtSize = tShirtSize;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "RubiksCubeCompetition [id=" + id + ", batch=" + batch + ", department=" + department + ", userName="
				+ userName + ", tShirtSize=" + tShirtSize + ", email=" + email + ", mobileNumber=" + mobileNumber + "]";
	}
	
	
	
	
}
