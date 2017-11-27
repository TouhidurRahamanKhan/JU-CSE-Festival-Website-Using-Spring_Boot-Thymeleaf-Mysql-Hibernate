package com.touhid.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.touhid.app.dao.GammingCompetitionDao;
import com.touhid.app.dao.ProgrammingContestDao;
import com.touhid.app.dao.ProjectShowDao;
import com.touhid.app.domain.GammingCompetition;
import com.touhid.app.domain.ProgrammingContestTeam;
import com.touhid.app.domain.ProjectShowTeam;
import com.touhid.app.service.GammingCompetitionService;
import com.touhid.app.service.ProgrammingContestService;
import com.touhid.app.service.ProjectShowService;

@Service
public class GammingCompetitionServiceImpl implements GammingCompetitionService {

	@Autowired
	private GammingCompetitionDao dao;

	@Override
	public void save(GammingCompetition team) {

		dao.save(team);
	}

	@Override
	public List<GammingCompetition> getAll() {
		
		return (List<GammingCompetition>) dao.findAll();
	}

}
