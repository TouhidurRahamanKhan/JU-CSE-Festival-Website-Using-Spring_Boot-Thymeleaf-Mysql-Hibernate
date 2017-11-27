package com.touhid.app.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProjectShowTeamMemeber {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String tShirtSize;
	private String email;
	private String mobile;
	public ProjectShowTeamMemeber() {
		// TODO Auto-generated constructor stub
	}
	public ProjectShowTeamMemeber(String name, String tShirtSize, String email, String mobile) {
		super();
		this.name = name;
		this.tShirtSize = tShirtSize;
		this.email = email;
		this.mobile = mobile;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "ProjectShowTeamMemeber [id=" + id + ", name=" + name + ", tShirtSize=" + tShirtSize + ", email=" + email
				+ ", mobile=" + mobile + "]";
	}
	
	
	
	
}
