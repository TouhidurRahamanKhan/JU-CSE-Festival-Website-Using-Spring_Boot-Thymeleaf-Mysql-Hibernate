package com.touhid.app.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.touhid.app.dao.ProgrammingContestDao;
import com.touhid.app.domain.ProgrammingContestTeam;
import com.touhid.app.service.ProgrammingContestService;

@Service
public class ProgrammingContestServiceImpl implements ProgrammingContestService {

	@Autowired
	private ProgrammingContestDao dao;

	@Override
	public void save(ProgrammingContestTeam team) {

		dao.save(team);
	}

	@Override
	public ArrayList<ProgrammingContestTeam> getAll() {
		
		return (ArrayList<ProgrammingContestTeam>) dao.findAll();
	}

}
