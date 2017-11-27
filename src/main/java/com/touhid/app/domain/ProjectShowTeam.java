package com.touhid.app.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class ProjectShowTeam {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long teamId;
	private String batch;
	private String teamName;
	private String department;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="teamId")
	private List<ProjectShowTeamMemeber> members;
	
	
	public ProjectShowTeam() {
		members=new ArrayList<>();
	}
	
	public Long getTeamId() {
		return teamId;
	}
	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public List<ProjectShowTeamMemeber> getMembers() {
		return members;
	}
	public void setMembers(List<ProjectShowTeamMemeber> members) {
		this.members = members;
	}

	@Override
	public String toString() {
		return "ProjectShowTeam [teamId=" + teamId + ", batch=" + batch + ", teamName=" + teamName + ", department="
				+ department + ", members=" + members + "]";
	}
	
	
	
	
}
