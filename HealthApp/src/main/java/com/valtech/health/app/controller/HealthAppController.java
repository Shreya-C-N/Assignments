package com.valtech.health.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.valtech.health.app.entity.Doctor;
import com.valtech.health.app.entity.DoctorUser;
import com.valtech.health.app.entity.PatientDetails;
import com.valtech.health.app.entity.User;
import com.valtech.health.app.model.DoctorUserModel;
import com.valtech.health.app.model.PatientDetailsModel;
import com.valtech.health.app.model.UserModel;
import com.valtech.health.app.service.DoctorService;
import com.valtech.health.app.service.DoctorServiceImpl;
import com.valtech.health.app.service.DoctorUserServiceImpl;
import com.valtech.health.app.service.PatientDetailsService;
import com.valtech.health.app.service.PatientDetailsServiceImpl;
import com.valtech.health.app.service.UserService;
import com.valtech.health.app.service.UserServiceImpl;

@Controller
public class HealthAppController {

	@Autowired
	private UserServiceImpl usi;
	
	@Autowired
	private DoctorUserServiceImpl dusi;
	
	@Autowired
	private DoctorServiceImpl dsi;
	
	@Autowired
	private DoctorService ds;
	@Autowired
	private PatientDetailsService ps;
	
	@Autowired
	private PatientDetailsServiceImpl pdsi;
	
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	@GetMapping("/aboutus")
	public String aboutUS() {
		return "aboutus";
	}
	@GetMapping("/home")//staff
	public String home() {
		return "home";
	}
	
	@GetMapping("/doctorhome")
	public String doctorhome() {
		return "doctorhome";
	}
	
    @ResponseBody
	@PostMapping("/login")//staff
	public String loginUser(){
		
		return "new1";
	}
	
/*	@ResponseBody
	@PostMapping("/login")//staff
	public String loginUser(@ModelAttribute UserModel userModel){
		   if(usi.LoginValidator(userModel.getUsername())==1){
	            return "new1";
	        }
		return "new1";
	}*/
	
	@GetMapping("/login")
	public String login(){
		return "login";
	}
	
	  //@ResponseBody
		@PostMapping("/doctorlogin")//doctor
		public String doctorLoginUser(){
		
			return "new";
		}
		
		@GetMapping("/doctorlogin")
		public String doctorLogin(){
			return "doctorlogin";
		}
	
	
	@PostMapping("/register")
	public String registerUser(@ModelAttribute User u,@ModelAttribute UserModel userModel){
		if(userModel.getPassword().equals(userModel.getConfirmpassword())){
	//	ModelAndView mv=new ModelAndView("login");
		usi.createUser(u);
		
		return "login";
		}
		else
		return "register";
	
	}
	@GetMapping("/register")
	public String register(@ModelAttribute User u){
		return "register";
		
	}
	
	@PostMapping("/doctorregister")
	public String doctorRegisterUser(@ModelAttribute DoctorUser u,@ModelAttribute DoctorUserModel doctorUserModel){
		if(doctorUserModel.getPassword().equals(doctorUserModel.getConfirmpassword())){
	//	ModelAndView mv=new ModelAndView("login");
		dusi.createDoctorUser(u);
		return "doctorlogin";
		}
		else
		return "doctorregister";
	
	}
	@GetMapping("/doctorregister")
	public String doctorRegister(@ModelAttribute DoctorUser u){
		return "doctorregister";
		
	}
	
	@GetMapping("/patientdetails")
	public String newpatientdetails(){
		
		return "patientdetails";
	}
	@PostMapping("/patientdetails")
	public String patientdetails(@ModelAttribute PatientDetails p){
		pdsi.createPatientDetails(p);
		
		return "demo";
	}
	
	@GetMapping("/doctor")
	public String newdoctordetails(){
		return "doctor";
	}
	@PostMapping("/doctor")
	public String doctorPatientdetails(@ModelAttribute Doctor d){
		dsi.createDoctor(d);
		return "demo";
	}
	
//	@GetMapping("/list")
//	public String newlist(){
//		return "list";
//	}
	@GetMapping("/list")
	public String list(Model model){
			
	    model.addAttribute("a",ps.getAllPatientDetails());
		return "list"; // prefix/cars/listsuffix /WEB-INF/views/Cars/list.jsp
	}
	
//	@GetMapping("/doctorlist")
//	public String newDoctorList(){
//		return "doctorlist";
//	}
	@GetMapping("/doctorlist")
	public String doctorList(Model model){
			
			model.addAttribute("b",ds.getAllComments());
		return "doctorlist"; // prefix/cars/listsuffix /WEB-INF/views/Cars/list.jsp
	}
		
	@GetMapping("/demo")
    public String index1() {
        return "demo";
    }



@GetMapping("/new")
    public String createnew() {
        return "new";
    }
@GetMapping("/logout")
public String logout(){
    return "index";
}

@GetMapping("/new1")
    public String createnew1() {
        return "new1";
    }
	
}
