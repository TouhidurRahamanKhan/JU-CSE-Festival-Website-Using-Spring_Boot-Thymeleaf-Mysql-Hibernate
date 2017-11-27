package com.touhid.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.touhid.app.dao.ProgrammingContestDao;
import com.touhid.app.dao.ProjectShowDao;
import com.touhid.app.domain.ProgrammingContestTeam;
import com.touhid.app.domain.ProjectShowTeam;
import com.touhid.app.service.ProgrammingContestService;
import com.touhid.app.service.ProjectShowService;

@Service
public class ProjectShowServiceImpl implements ProjectShowService {

	@Autowired
	private ProjectShowDao dao;

	@Override
	public void save(ProjectShowTeam team) {

		dao.save(team);
	}

	@Override
	public List<ProjectShowTeam> getAll() {
		
		return (List<ProjectShowTeam>) dao.findAll();
	}

}
