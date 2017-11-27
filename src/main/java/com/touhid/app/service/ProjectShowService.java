package com.touhid.app.service;

import java.util.List;

import com.touhid.app.domain.ProjectShowTeam;

public interface ProjectShowService {

	public void save(ProjectShowTeam team);
	public List<ProjectShowTeam> getAll();
}
