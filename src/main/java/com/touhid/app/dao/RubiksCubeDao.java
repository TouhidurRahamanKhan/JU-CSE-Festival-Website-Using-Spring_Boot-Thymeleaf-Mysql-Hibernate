package com.touhid.app.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.touhid.app.domain.ProgrammingContestTeam;
import com.touhid.app.domain.ProjectShowTeam;
import com.touhid.app.domain.RubiksCubeCompetition;



@Repository
public interface RubiksCubeDao extends  CrudRepository<RubiksCubeCompetition, Long>{

}
