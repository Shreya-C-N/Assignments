package com.valtech.health.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.valtech.health.app.entity.Doctor;
import com.valtech.health.app.entity.DoctorUser;
import com.valtech.health.app.entity.PatientDetails;
import com.valtech.health.app.entity.User;
import com.valtech.health.app.model.DoctorUserModel;
import com.valtech.health.app.model.PatientDetailsModel;
import com.valtech.health.app.model.UserModel;
import com.valtech.health.app.repostitory.DoctorRepository;
import com.valtech.health.app.repostitory.DoctorUserRepository;
import com.valtech.health.app.repostitory.UserRepository;
import com.valtech.health.app.service.DoctorService;
import com.valtech.health.app.service.DoctorServiceImpl;
import com.valtech.health.app.service.DoctorUserService;
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
	private UserService us;
	@Autowired
	private UserRepository ur;
	@Autowired
	private DoctorUserRepository dur;
	@Autowired
	private DoctorRepository docr;
	@Autowired
	private DoctorUserService dus;


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
	@GetMapping("/home")
	public String home() {
		return "home";
	}

	@GetMapping("/doctorhome")
	public String doctorhome() {
		return "doctorhome";
	}

	// @ResponseBody
	@PostMapping("/login") // staff
	public String loginUser(@ModelAttribute UserModel userModel,@RequestParam("username") String username, @RequestParam("password") String password,
			Model model) {
		String url;
		User u = null;
		User u1 = null;
		try {
			u = ur.findByUsername(username);
			u1 = ur.findByPassword(password);
		} catch (Exception e) {
			System.out.println("User not found !!!");

		}
		if (u != null && u1 != null) {
			model.addAttribute("username", username);
			// model.addAttribute("password", password);
			int id= us.getIdbyUsername((userModel.getUsername()));
	         url="redirect:/dashboard/"+id;
	          
	            return url;
		}
		model.addAttribute("error", "Entered username or password are not correct");
		return "login";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	//@ResponseBody
	@PostMapping("/doctorlogin") // doctor
	public String doctorLoginUser(@ModelAttribute DoctorUserModel doctorUserModel,@RequestParam("username") String username, @RequestParam("password") String password,
			Model model) {
		String url;
		DoctorUser du = null;
		DoctorUser du1 = null;
		try {
			du = dur.findByUsername(username);
			du1 = dur.findByPassword(password);
		} catch (Exception e) {
			System.out.println("User not found !!!");

		}
		if (du != null && du1 != null) {
			model.addAttribute("username", username);
	int id= dus.getIdbyUsername((doctorUserModel.getUsername()));
         url="redirect:/doctordashboard/"+id;
          
            return url;
		
		}
		model.addAttribute("error", "Entered username or password are not correct");
		return "doctorlogin";

	}

	@GetMapping("/doctorlogin")
	public String doctorLogin() {
		return "doctorlogin";
	}

	@PostMapping("/register")
	public String registerUser(@RequestParam("email") String email,@Valid @ModelAttribute User u,
			@ModelAttribute UserModel userModel, Model model,BindingResult result) {
		User u1 = null;
		
		try {

			u1 = ur.findByEmail(email);
		} catch (Exception e) {
			System.out.println("User already registered !!!");
		}
		if (u1 != null) {
			model.addAttribute("error", "User Already Registered");
			return "register";
		}
		
	
		if (userModel.getPassword().equals(userModel.getConfirmpassword())) {
		
				
			usi.createUser(u);
			model.addAttribute("success", "Successfully Registered");

			return "login";

		}
			else {
			model.addAttribute("error", "Password and Confirm Password doesnot match");
			return "register";
		}

	}

	@GetMapping("/register")
	public String register(@ModelAttribute User u) {
		return "register";

	}


	@PostMapping("/doctorregister")
	public String doctorRegisterUser(@RequestParam("email") String email, @Valid @ModelAttribute DoctorUser u,
			@ModelAttribute DoctorUserModel doctorUserModel, Model model,BindingResult result ) {
		
		DoctorUser d = null;
		
		try {

			d = dur.findByEmail(email);
		} catch (Exception e) {
			System.out.println("User already registered !!!");
		}
		
		
		if (d != null) {
			model.addAttribute("error", "User Already Registered");
			return "doctorregister";
		}
		
		
		if (doctorUserModel.getPassword().equals(doctorUserModel.getConfirmpassword())) {
			// ModelAndView mv=new ModelAndView("login");
			
		
			dusi.createDoctorUser(u);
			model.addAttribute("success", "Successfully Registered");
			return "doctorlogin";
		
		} else {
			model.addAttribute("error", "Password and Confirm Password doesnot match");
			return "doctorregister";
		}
	
	}

	@GetMapping("/doctorregister")
	public String doctorRegister(@ModelAttribute DoctorUser u) {
		return "doctorregister";

	}

	@GetMapping("/patientdetails")
	public String newpatientdetails() {

		return "patientdetails";
	}

	@PostMapping("/patientdetails")
	public void patientdetails(@ModelAttribute PatientDetails p,@RequestParam("doctorsname") String doctorsname, Model model) {

	/*	Doctor doc = null;
try {
			doc = docr.find
			doc=docr.findByDoctorsname(doctorsname);
		}
		catch(Exception e){
			System.out.println("Doctor not available !!!");
		}
		if(!du.equals(doc)){
			model.addAttribute("error", "Doctor is not available");
		
		}*/
		pdsi.createPatientDetails(p);
		model.addAttribute("success", "Successfully Sent");
		// return "demo";
	}

	@GetMapping("/doctor")
	public String newdoctordetails() {
		return "doctor";
	}

	@PostMapping("/doctor")
	public void doctorPatientdetails(@ModelAttribute Doctor d, Model model) {
	
		dsi.createDoctor(d);
		
		model.addAttribute("success", "Successfully Sent");
		// return "demo";
	}

	@GetMapping("/commentlist") // staff
	public String Comments(Model model) {
		model.addAttribute("d", ds.getAllDoctorComments());
		return "commentlist";
	}

	@GetMapping("/list")
	public String list(Model model) {

		model.addAttribute("p", ps.getAllPatientDetails());
		return "list"; // prefix/cars/listsuffix /WEB-INF/views/Cars/list.jsp
	}

	@GetMapping("/doctorlist")
	public String doctorList(Model model) {

		model.addAttribute("d", ds.getAllDoctorComments());
		
		return "doctorlist"; // prefix/cars/listsuffix
								// /WEB-INF/views/Cars/list.jsp
	}

	

	@PostMapping("/updatePatientDetails/{id}")
	public ModelAndView saveUpdatePatientDetails(@PathVariable("id") int id, @ModelAttribute PatientDetails p,
			@RequestParam("submit") String submit) {
		ModelAndView view = new ModelAndView("/list");
		if (submit.equals("Cancel")) {
			view.addObject("p", ps.getAllPatientDetails());
			return view;
		}
		ps.updatePatientsDetails(p);
		view.addObject("p", ps.getAllPatientDetails());
		return view;
	}

	@GetMapping("/updatePatientDetails/{id}")
	public String updatePatientsDetails(@PathVariable("id") int id, Model model) {
		model.addAttribute("p", ps.getPatientById(id));
		return "updatePatientDetails";
	}

	@PostMapping("/updateDoctorComments/{id}")
	public ModelAndView saveUpdateDoctorComments(@PathVariable("id") int id, @ModelAttribute Doctor d,
			@RequestParam("submit") String submit) {
		ModelAndView view = new ModelAndView("/doctorlist");
	if (submit.equals("Cancel")) {
			view.addObject("d", ds.getAllDoctorComments());
			return view;
		}
		
		
		ds.updateDoctorComments(d);
		view.addObject("d", ds.getAllDoctorComments());
		return view;
		
	}

	@GetMapping("/updateDoctorComments/{id}")
	public String updateDoctorComments(@PathVariable("id") int id, Model model) {
		model.addAttribute("d", ds.getDoctorCommentById(id));
		
		return "updateDoctorComments";
	}

@GetMapping("/doctordashboard/{id}")
    public String createnew(@PathVariable("id") int id,ModelMap model) {
	ModelAndView view = new ModelAndView("doctordashboard"); 
	DoctorUser u=dus.getUsername(id);
	//System.out.println(u);
model.addAttribute("add",u.getName());


	return "doctordashboard";
    }

/*@GetMapping("/new")
public String createnew() {
	return "new";
}*/

/*	@GetMapping("/new1")
	public String createnew1() {
		return "new1";
	}
*/
	
	@GetMapping("/dashboard/{id}")
    public String createnew1(@PathVariable("id") int id,ModelMap model) {
	ModelAndView view = new ModelAndView("dashboard"); 
	User u=us.getUsername(id);
//	System.out.println(u);
model.addAttribute("add",u.getName());
//System.out.println(model.addAttribute("ad",u.getId()));

	return "dashboard";
    }
	
	@GetMapping("/logout")
	public String logout() {
		return "index";
	}
	
}
