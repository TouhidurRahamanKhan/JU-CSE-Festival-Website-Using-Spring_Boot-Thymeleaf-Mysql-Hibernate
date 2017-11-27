package com.touhid.app.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.touhid.app.domain.ChessCompetition;
import com.touhid.app.domain.ProgrammingContestTeam;
import com.touhid.app.domain.ProjectShowTeam;



@Repository
public interface ChessCompitionDao extends  CrudRepository<ChessCompetition, Long>{

}
