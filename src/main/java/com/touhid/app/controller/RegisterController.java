package com.touhid.app.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.touhid.app.domain.ChessCompetition;
import com.touhid.app.domain.GammingCompetition;
import com.touhid.app.domain.ProgrammingContestTeam;
import com.touhid.app.domain.ProgrammingContestTeamMemeber;
import com.touhid.app.domain.ProjectShowTeam;
import com.touhid.app.domain.RubiksCubeCompetition;
import com.touhid.app.service.ChessCompetitionService;
import com.touhid.app.service.GammingCompetitionService;
import com.touhid.app.service.ProgrammingContestService;
import com.touhid.app.service.ProjectShowService;
import com.touhid.app.service.RubiksCubeCompetitionService;

@Controller
@RequestMapping("/register")
public class RegisterController {

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

	@RequestMapping(value = "/contest", method = RequestMethod.GET)
	public String progContestRegister(Model model) {

		ProgrammingContestTeam team = new ProgrammingContestTeam();
		model.addAttribute("team", team);

		return "progContestRegister";
	}

	@RequestMapping(value = "/contest", method = RequestMethod.POST)
	public String progContestRegisterPost(RedirectAttributes model, @ModelAttribute("team") ProgrammingContestTeam team) {
		
		model.addAttribute("successMessage", "Registration Complete");

		progContestService.save(team);
		return "redirect:/register/contest";
	}

	@RequestMapping(value = "/projectShow", method = RequestMethod.GET)
	public String projectShowRegister(Model model) {

		ProjectShowTeam team = new ProjectShowTeam();
		model.addAttribute("team", team);

		return "projectShowRegister";
	}

	@RequestMapping(value = "/projectShow", method = RequestMethod.POST)
	public String projectShowRegisterPost(RedirectAttributes model, @ModelAttribute("team") ProjectShowTeam team) {
		
		model.addAttribute("successMessage", "Registration Complete");

		projectShowService.save(team);
		return "redirect:/register/projectShow";
	}

	@RequestMapping(value = "/chessCompetition", method = RequestMethod.GET)
	public String chessRegister(Model model) {

		ChessCompetition team = new ChessCompetition();
		model.addAttribute("team", team);

		return "chessRegister";
	}

	@RequestMapping(value = "/chessCompetition", method = RequestMethod.POST)
	public String chessRegisterPost(RedirectAttributes model, @ModelAttribute("team") ChessCompetition team) {
		
		model.addAttribute("successMessage", "Registration Complete");

		chessComService.save(team);
		return "redirect:/register/chessCompetition";
	}

	@RequestMapping(value = "/gammingCompetition", method = RequestMethod.GET)
	public String gameRegister(Model model) {

		GammingCompetition team = new GammingCompetition();

		model.addAttribute("team", team);
		return "gammingContestRegister";
	}

	@RequestMapping(value = "/gammingCompetition", method = RequestMethod.POST)
	public String gameRegisterPost(RedirectAttributes model, @ModelAttribute("team") GammingCompetition team) {

		
		model.addAttribute("successMessage", "Registration Complete");

		gammingComService.save(team);
		return "redirect:/register/gammingCompetition";
	}

	@RequestMapping(value = "/rubiksCubeCompetition", method = RequestMethod.GET)
	public String rubiksRegister(Model model) {

		RubiksCubeCompetition team = new RubiksCubeCompetition();
        model.addAttribute("team", team);
        
		return "rubiksCubeRegistration";
	}

	@RequestMapping(value = "/rubiksCubeCompetition", method = RequestMethod.POST)
	public String rubiksRegisterPost(RedirectAttributes model, @ModelAttribute("team") RubiksCubeCompetition team) {

		
		model.addAttribute("successMessage", "Registration Complete");

		rubiksComService.save(team);
		return "redirect:/register/rubiksCubeCompetition";
	}

	@ModelAttribute("batchList")
	public Map<String, String> batchList() {
		Map<String, String> batch = new HashMap<String, String>();
		
		batch.put("42", "42");
		batch.put("43", "43");
		batch.put("44", "44");
		batch.put("45", "45");
		batch.put("46", "46");

		return batch;
	}

	@ModelAttribute("departmentList")
	public Map<String, String> deptList() {
		Map<String, String> departmentList = new HashMap<String, String>();
		
		departmentList.put("CSE", "CSE");
		departmentList.put("IIT", "IIT");

		return departmentList;
	}

	@ModelAttribute("tsize")
	public Map<String, String> tShirtSizeList() {
		Map<String, String> tsize = new HashMap<String, String>();
		
		tsize.put("S", "S");
		tsize.put("M", "M");
		tsize.put("L", "L");
		tsize.put("XL", "XL");

		return tsize;
	}

}
