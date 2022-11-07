package com.valtech.health.app.controller;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HealthAppController {
	
	@GetMapping("/login")
	public String login(){
		return "login";
	}
	@GetMapping("/register")
	public String register(){
		return "register";
	}
}
