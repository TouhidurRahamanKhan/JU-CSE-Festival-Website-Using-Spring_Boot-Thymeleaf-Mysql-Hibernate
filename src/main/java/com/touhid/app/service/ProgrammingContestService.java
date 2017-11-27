package com.touhid.app.service;

import java.util.ArrayList;

import com.touhid.app.domain.ProgrammingContestTeam;

public interface ProgrammingContestService {

	public void save(ProgrammingContestTeam team);
	public ArrayList<ProgrammingContestTeam> getAll();
}
