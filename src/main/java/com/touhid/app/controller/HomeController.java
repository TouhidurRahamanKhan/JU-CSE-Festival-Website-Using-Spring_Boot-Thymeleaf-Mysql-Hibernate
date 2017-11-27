package com.touhid.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HomeController {

	
	@RequestMapping("/home")
	public String home(Model model){
//		if(1==1)
//		throw new RuntimeException();
		return "index";
	}
	
	
	@RequestMapping("/")
	public String root(Model model){
		
		
		return "redirect:/home";
	}
	
	
	@RequestMapping("/gallery")
	public String gallary(Model model){
		
		
		
		
		return "gallery";
	}
	
	
	
	
	
	@RequestMapping("/contact")
	public String contact(Model model){
		
		
		
		
		return "contact";
	}
	
}
