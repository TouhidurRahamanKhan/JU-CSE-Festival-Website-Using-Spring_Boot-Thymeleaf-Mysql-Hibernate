package com.touhid.app.service;

import java.util.List;

import com.touhid.app.domain.ChessCompetition;

public interface ChessCompetitionService {

	public void save(ChessCompetition team);
	public List<ChessCompetition> getAll();
}
