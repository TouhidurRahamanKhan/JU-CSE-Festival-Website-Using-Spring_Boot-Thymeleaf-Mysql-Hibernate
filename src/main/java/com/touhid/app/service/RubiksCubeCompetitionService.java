package com.touhid.app.service;

import java.util.List;

import com.touhid.app.domain.RubiksCubeCompetition;

public interface RubiksCubeCompetitionService {

	public void save(RubiksCubeCompetition team);
	public List<RubiksCubeCompetition> getAll();
}
