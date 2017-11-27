package com.touhid.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

@Controller
@RequestMapping("/display")
public class DisplayController {

	
	@Autowired
	private ProgrammingContestService progContestService;
	@Autowired
	private ProjectShowService projectShowService;

	@Autowired
	private GammingCompetitionService gammingComService;

	@Autowired
	private ChessCompetitionService chessComService;

	@Autowired
	private RubiksCubeCompetitionService rubiksComService;
	
	
	
	@RequestMapping("/progContest")
	public String progContestTeams(Model model){

		model.addAttribute("teamList", progContestService.getAll());
		return "progContestDisplay";
	}
	
	
	@RequestMapping("/projectShow")
	public String projectShowTeams(Model model){
		
        
        
      
    	model.addAttribute("teamList", projectShowService.getAll());
		return "projectShowDisplay";
	}
	
	
	@RequestMapping("/rubiksCube")
	public String rubiksCubeTeams(Model model){
		
		
		
		
		model.addAttribute("teamList", rubiksComService.getAll());
		
		return "rubiksCubeDisplay";
	}
	
	
	@RequestMapping("/gamming")
	public String gammingTeams(Model model){
		
		
		
		
		model.addAttribute("teamList", gammingComService.getAll());
		return "gammingDisplay";
	}
	
	
	@RequestMapping("/chess")
	public String chessTeams(Model model){
		
		
		
		model.addAttribute("teamList", chessComService.getAll());
		return "chessDisplay";
	}
}
