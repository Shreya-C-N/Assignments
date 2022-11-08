package com.valtech.health.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.valtech.health.app.entity.User;
import com.valtech.health.app.model.UserModel;
import com.valtech.health.app.service.UserService;
import com.valtech.health.app.service.UserServiceImpl;

@Controller
public class HealthAppController {
	
	@Autowired
	private UserServiceImpl usi;
	@Autowired
	private UserService userService;
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}

	@PostMapping("/login")
	public String loginUser(){
		return "login";
	}
	@GetMapping("/login")
	public String login(){
		return "login";
	}
	
	@PostMapping("/register")
	public String registerUser(@ModelAttribute User u){
		usi.createUser(u);
		return "register";
	}
	@GetMapping("/register")
	public String register(@ModelAttribute User u){
		
		return "register";
	}



//	@PostMapping("/register")
//	public String registerUser(@ModelAttribute UserModel userModel){
//		String name=userModel.getName();
//		int number=userModel.getNumber();
//		String email=userModel.getEmail();
//		String username=userModel.getUsername();
//		String password=userModel.getPassword();
//		String confirmpassword=userModel.getConfirmpassword();
//		if(password.equals(confirmpassword)){
//			UserDetailsManager.createUser(User.withUsername(username).password(password).roles("USER").build());
//		return "login";
//		}
//			else{
//				return "register";
//			}
//		}
	
	
}
