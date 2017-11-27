package com.touhid.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.touhid.app.domain.ChessCompetition;
import com.touhid.app.domain.GammingCompetition;
import com.touhid.app.domain.ProgrammingContestTeam;
import com.touhid.app.domain.ProgrammingContestTeamMemeber;
import com.touhid.app.domain.ProjectShowTeam;
import com.touhid.app.domain.ProjectShowTeamMemeber;
import com.touhid.app.domain.RubiksCubeCompetition;
import com.touhid.app.service.ChessCompetitionService;
import com.touhid.app.service.GammingCompetitionService;
import com.touhid.app.service.ProgrammingContestService;
import com.touhid.app.service.ProjectShowService;
import com.touhid.app.service.RubiksCubeCompetitionService;

@SpringBootApplication
@Controller
public class Application {

	
	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	
	
}
