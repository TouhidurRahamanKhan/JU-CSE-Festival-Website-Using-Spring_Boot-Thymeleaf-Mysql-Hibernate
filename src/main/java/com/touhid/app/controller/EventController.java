package com.touhid.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/event")
public class EventController {

	@RequestMapping("/projectShow")
	public String projectShow(){
		


		return "project-showcasing";
	}
	
	@RequestMapping("/rubiksCube")
	public String rubiksCube(){
		


		return "rubiks-cube-contest";
	}
	
	
	@RequestMapping("/gamming")
	public String gamming(){
		


		return "gaming-competition";
	}
	
	
	@RequestMapping("/chess")
	public String chess(){
		


		return "chess-competition";
	}
	
	
	@RequestMapping("/contest")
	public String contest(){
		


		return "prog-contest";
	}
	
	
}
