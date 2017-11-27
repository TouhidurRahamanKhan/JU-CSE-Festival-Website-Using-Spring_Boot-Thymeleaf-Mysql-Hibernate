package com.touhid.app.service;

import java.util.List;

import com.touhid.app.domain.GammingCompetition;

public interface GammingCompetitionService {

	public void save(GammingCompetition team);
	public List<GammingCompetition> getAll();
}
