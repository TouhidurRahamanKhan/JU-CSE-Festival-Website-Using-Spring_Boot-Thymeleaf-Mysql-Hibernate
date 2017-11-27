package com.touhid.app.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.touhid.app.domain.ProgrammingContestTeam;



@Repository
public interface ProgrammingContestDao extends  CrudRepository<ProgrammingContestTeam, Long>{

}
