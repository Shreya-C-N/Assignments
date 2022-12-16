package com.valtech.health.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.valtech.health.app.entity.Admin;
import com.valtech.health.app.entity.Doctor;
import com.valtech.health.app.entity.DoctorUser;
import com.valtech.health.app.entity.Hospital;
import com.valtech.health.app.entity.PatientDetails;
import com.valtech.health.app.entity.User;
import com.valtech.health.app.model.DoctorUserModel;
import com.valtech.health.app.model.UserModel;
import com.valtech.health.app.repostitory.UserRepository;
import com.valtech.health.app.service.AdminService;
import com.valtech.health.app.service.DoctorService;
import com.valtech.health.app.service.DoctorUserService;
import com.valtech.health.app.service.EmailService;
import com.valtech.health.app.service.HospitalService;
import com.valtech.health.app.service.PatientDetailsService;
import com.valtech.health.app.service.UserService;

@Controller
public class HealthAppController {

	@Autowired
	private UserService userService;
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private DoctorUserService doctorUserService;
	
	@Autowired
	private DoctorService doctorService;
	@Autowired
	private AdminService adminService;
	@Autowired
	private PatientDetailsService patientService;
	@Autowired
	private HospitalService hospitalService;
	@Autowired
	private EmailService emailService;
	@Autowired
	private JavaMailSender mailSender;
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	
	private final Logger logger = LoggerFactory.getLogger(HealthAppController.class);

	/* About Us */
	@GetMapping("/aboutus")
	public String aboutUS() {
		logger.info("moving to about us page");
		logger.debug("moved to aboutus");
		return "aboutus";

	}

	

	/* This method creates Admin DashBoard */
	@GetMapping("/admindashboard")
	public String createnewadmin() {
		logger.info("login to admindashboard");
		logger.debug("login successfull");
		return "admindashboard";
	}

	/* This method helps us to check availability of hospital and doctors */
	@GetMapping("/admin")
	public String newambulance(Model m) {
		logger.info("to get availability");
		List<Hospital> ha = hospitalService.getAllHospitals();
		m.addAttribute("ha", ha);
		logger.debug("updated successful");
		return "admin";
	}

	/* This method helps us to check availability of hospital and doctors */
	@PostMapping("/admin")
	public String ambulance(@ModelAttribute Admin a, Model model) {
		logger.info("create availability");
		adminService.createAvailability(a);
		if ((a.getDoctorsAvailability().equals("Yes")) && (a.getBedAvailability().equals("Yes"))) {
			logger.info("check availability");
			model.addAttribute("success", "Succesfully Updated");
			logger.debug("available");
			return "admin";
		} else {
			logger.info("rejected");
			model.addAttribute("error", "No Availability");
			logger.debug("not available");
			return "admin";
		}

	}

	/* To add hospital */
	@GetMapping("/hospital")
	public String newhospital() {
		logger.info("get hospital details");
		logger.debug("hospital details received");
		return "hospital";
	}

	/* To add hospital */
	@PostMapping("/hospital")
	public void hospital(@ModelAttribute Hospital h, Model model) {
		logger.info("to add hospital details");
		hospitalService.createHospital(h);
		model.addAttribute("success", "Successfully Sent");
		logger.debug("hospital details added");
	}

	/* This method lists the hospitals */
	@GetMapping("/hospitallist")
	public String hospitallist(Model model) {
		logger.info("to get details");
		model.addAttribute("h", hospitalService.getAllHospitals());
		logger.debug("hospital details added");
		return "hospitallist";
	}

	/* This method lists the availability */
	@GetMapping("/adminlist")
	public String Commentsambulance(Model model) {
		logger.info("to get admin details");
		model.addAttribute("am", adminService.getAllAvailability());
		logger.debug("admin details added");
		return "adminlist";
	}

	/* This method updates the hospital */
	@PostMapping("/updatehospitals/{id}")
	public ModelAndView saveUpdateHospitalDetails(@PathVariable("id") int id, @ModelAttribute Hospital h,
			@RequestParam("submit") String submit) {
		logger.info("update hospital details");
		ModelAndView view = new ModelAndView("/hospitallist");
		if (submit.equals("Cancel")) {
			logger.info("no details are updated");
			view.addObject("h", hospitalService.getAllHospitals());
			logger.debug("cancelled");
			return view;
		}
		hospitalService.updateHospitalDetails(h);
		view.addObject("h", hospitalService.getAllHospitals());
		logger.info("updated hospital details");
		return view;
	}

	/* This method updates the hospital */
	@GetMapping("/updatehospitals/{id}")
	public String updateHospitalDetails(@PathVariable("id") int id, Model model) {
		logger.info("update for hospital");
		model.addAttribute("h", hospitalService.getHospitalById(id));
		logger.debug("updated for hospital");
		return "updatehospital";
	}

	/* This method displays the nurse home page */
	@GetMapping("/home")
	public String home() {
		logger.info("redirects to nurse");
		logger.debug("redirection successfull");
		return "home";
	}

	/* Login Page for Nurse */
	@PostMapping("/login")
	public String loginUser(@ModelAttribute User userModel, @ModelAttribute DoctorUser doctorUserModel,
			@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
		logger.info("moving to login");
		String url;
		User u = null;
		User u1 = null;

		DoctorUser du = null;
		DoctorUser du1 = null;

		System.out.println(userModel.getUsername() + userModel.getPassword());
		System.out.println(username + password);
		try {
			
			u = userService.findByUsername(userModel.getUsername());
			u1 = userService.findByPassword(userModel.getPassword());

			du = doctorUserService.findByUsername(doctorUserModel.getUsername());
			du1 = doctorUserService.findByPassword(doctorUserModel.getPassword());
			
		}

		catch (Exception e) {
			System.out.println(userService.findByUsername(userModel.getUsername()));
			System.out.println(doctorUserService.findByUsername(userModel.getUsername()));

			System.out.println("User not found !!!");

		}

		if (u != null) {
			logger.info("print user");
			System.out.println(u);

			if (u.getRole().equals("NURSE")) {

				logger.info("redirect to nurse dashboard");
				System.out.println(u);
				model.addAttribute("username", username);
				int id = userService.getIdbyUsername((userModel.getUsername()));
				url = "redirect:/dashboard/" + id;
				logger.debug("successfully redirected to nurse dashboard");
				return url;
			}
		}
		if (du != null) {
			logger.info("prints doctoruser");
			System.out.println(du);

			if (du.getRole().equals("DOCTOR")) {
				logger.info("redirect to doctordashboard");
				model.addAttribute("username", username);
				int id = doctorUserService.getIdbyUsername((doctorUserModel.getUsername()));
				url = "redirect:/doctordashboard/" + id;
				logger.debug("successfully redirected to doctordashboard");
				return url;
			}
		}
		
		if (userModel.getUsername().equals("admin") && userModel.getPassword().equals("admin")) {
			//if (ad.setUsername("admin") && ad.setPassword(this.bryptPasswordEncoder.encode("admin"))){
				logger.info("login into admin");
				logger.debug("login successfull");
				return "admindashboard";
			} 
	

		model.addAttribute("error", "Entered username or password are not correct");
		logger.debug("successfully moved to login");
		return "login";
	}

	/* Login Page for Nurse */
	@GetMapping("/login")
	public String login() {
		logger.info("moving to login page");
		logger.debug("successfully redirected to login");
		return "login";
	}

	/* Register Page for Nurse */
	@PostMapping("/register")
	public String registerUser(@RequestParam("email") String email, @Valid @ModelAttribute User u,
			@Valid @ModelAttribute DoctorUser du, @ModelAttribute UserModel userModel, Model model,
			BindingResult result) {
		logger.info("moving to register page");
		User u1 = null;
		try {

			u1 = userRepo.findByEmail(email);
		} catch (Exception e) {
			System.out.println("User already registered !!!");
		}
		if (u1 != null) {
			logger.info("It will reject");
			model.addAttribute("error", "User Already Registered");
			logger.debug("return back to register page");
			return "register";
		}
		if (userModel.getPassword().equals(userModel.getConfirmpassword())) {
			logger.info("Checking the password with the confirm password");
			if (u.getRole().equals("NURSE")) {
				logger.info("Checking if the role is nurse");
				userService.createUser(u);
				logger.debug("redirected to login page");
				return "redirect:/login";
			} else {
				logger.info("Checking if the role is doctor ");
				doctorUserService.createDoctorUser(du);
				logger.debug("Redirected to login");
				return "redirect:/login";
			}
		} else {
			logger.info("It will check for the password to match with confirm password");
			model.addAttribute("error", "Password and Confirm Password doesnot match");
			logger.debug("Redirected to register");
			return "register";
		}
	}

	/* Register Page for Nurse */
	@GetMapping("/register")
	public String register(@ModelAttribute User u) {
		logger.info("moving to register page");
		logger.debug("Successfully moved to register page");
		return "register";
	}

	/* Dash-Board For Nurse */
	@GetMapping("/dashboard/{id}")
	public String createnew1(@PathVariable("id") int id, ModelMap model) {
		logger.info("Moving to nurse dashboard");
		ModelAndView view = new ModelAndView("dashboard");
		User u = userService.getUsername(id);
		model.addAttribute("add", u.getName());
		logger.debug("Moved to nurse dashboard");
		return "dashboard";
	}

	/* This method helps to send patient details */
	@GetMapping("/patientdetails")
	public String newpatientdetails(Model m) {
		logger.info("Moving to patientdetails");
		List<DoctorUser> da = doctorUserService.getAllDoctors();
		m.addAttribute("da", da);
		logger.debug("Moved to patientdetails");
		return "patientdetails";
	}

	/* This method helps to send patient details */
	@PostMapping("/patientdetails")
	public String patientdetails(@ModelAttribute PatientDetails p, ModelAndView model, Model m) {
		logger.info("Adding patientdetails");
		String to = doctorUserService.getEmailByName(p.getDoctorsname());
		String subject = "It's an emergency doctor!!";
		String text = "Please access the website";
		emailService.SendMail(to, subject, text);
		m.addAttribute("name", p.getName());
		patientService.createPatientDetails(p);
		m.addAttribute("success", "Successfully Sent");
		logger.debug("Successfully added");
		return "patientdetails";
	}

	/* This method helps to list the patient details */
	@GetMapping("/list")
	public String list(Model model) {
		logger.info("Display patientdetails");
		model.addAttribute("p", patientService.getAllPatientDetails());
		logger.debug("Successfully displayed patientdetails");
		return "list";
	}

	/* This method helps to update the patient details */
	@PostMapping("/updatePatientDetails/{id}")
	public ModelAndView saveUpdatePatientDetails(@PathVariable("id") int id, @ModelAttribute PatientDetails p,
			@RequestParam("submit") String submit) {
		logger.info("Updating the patient details");
		ModelAndView view = new ModelAndView("/list");
		if (submit.equals("Cancel")) {
			view.addObject("p", patientService.getAllPatientDetails());
			return view;
		}
		patientService.updatePatientsDetails(p);
		view.addObject("p", patientService.getAllPatientDetails());
		logger.debug("Successfully updated patientdetails");
		return view;
	}

	/* This method helps to update the patient details */
	@GetMapping("/updatePatientDetails/{id}")
	public String updatePatientsDetails(@PathVariable("id") int id, Model model) {
		logger.info("It will display the updated patientdetails");
		model.addAttribute("p", patientService.getPatientById(id));
		logger.debug("Successfully displayed updatedpatientdetails");
		return "updatePatientDetails";
	}

	/* Dash-Board For Doctor */
	@GetMapping("/doctordashboard/{id}")
	public String createnew(@PathVariable("id") int id, ModelMap model) {
		logger.info("Welcome page for doctor");
		ModelAndView view = new ModelAndView("doctordashboard");
		DoctorUser du = doctorUserService.getUsername(id);
		// System.out.println(u);
		model.addAttribute("add", du.getName());
		logger.debug("Displayed welcome page for doctor");
		return "doctordashboard";
	}

	/* This method helps to send doctor comments */
	@GetMapping("/doctor")
	public String newdoctordetails(Model m) {
		List<User> ad = userService.getAllUsers();
		m.addAttribute("ad", ad);
		return "doctor";
	}

	/* This method helps to send doctor comments */
	@PostMapping("/doctor")
	public String doctorPatientdetails(@ModelAttribute Doctor d, Model m) {
		logger.info("Send comment");
		String to = userService.getEmailByName(d.getNursename());
		String subject = "Doctor has been commented";
		String text = "Please access the website";
		emailService.SendMail(to, subject, text);
		m.addAttribute("name", d.getNursename());	
		doctorService.createDoctor(d);
		m.addAttribute("success", "Successfully Sent");
		logger.debug("Successfully added");
		return "doctor";
	/*	if (doctorUserService.findByName(d.getDoctorsname()) == true) {
			doctorService.createDoctor(d);
			model.addAttribute("success", "Successfully Sent");
		} else {

			model.addAttribute("error", "Invalid Doctor Name");
		}
		logger.debug("Sent comment successfully");
		return "doctor";*/

	}

	/* This method helps to list the doctor comments */
	@GetMapping("/doctorlist")
	public String doctorList(Model model) {

		model.addAttribute("d", doctorService.getAllDoctorComments());

		return "doctorlist";
	}

	/* This method helps to update the doctor comments */
	@PostMapping("/updateDoctorComments/{id}")
	public ModelAndView saveUpdateDoctorComments(@PathVariable("id") int id, @ModelAttribute Doctor d,
			@RequestParam("submit") String submit) {
		logger.info("It will update the doctor comments");
		ModelAndView view = new ModelAndView("/doctorlist");
		if (submit.equals("Cancel")) {
			view.addObject("d", doctorService.getAllDoctorComments());
			return view;
		}

		doctorService.updateDoctorComments(d);
		view.addObject("d", doctorService.getAllDoctorComments());
		logger.info("Successfully updated the doctor comments");
		return view;

	}

	/* This method helps to update the doctor comments */
	@GetMapping("/updateDoctorComments/{id}")
	public String updateDoctorComments(@PathVariable("id") int id, Model model) {
		logger.info("Update doctor comment");
		model.addAttribute("d", doctorService.getDoctorCommentById(id));
		logger.debug("Doctorscomment updated successfully");
		return "updateDoctorComments";
	}

	/* This method helps to update the doctor comments */
	@PostMapping("/forgotpassword")
	public String saveNewPassword(@RequestParam("otp") int otp, Model model, @ModelAttribute UserModel userModel,
			@ModelAttribute DoctorUserModel doctorUserModel, @RequestParam("submit") String submit) {
		logger.info("Change the password");
		User u = null;
		DoctorUser du = null;
		try {
			logger.info("sending OTP");
			u = userService.findByOtp(otp);
			du = doctorUserService.findByOtp(otp);
			logger.debug("OTP sent");
		} catch (Exception e) {
			logger.info("Error");
			System.out.println("User not found !!!");
			logger.info("OTP not sent");
		}
		
		
		if (u != null) {
			logger.info("Return to login page");
			if ((u.getOtp()==otp)&&(userModel.getPassword().equals(userModel.getConfirmpassword()))){
				  String encodedPassword = this.bCryptPasswordEncoder.encode(userModel.getPassword());
				     String encodedPassword1 = this.bCryptPasswordEncoder.encode(userModel.getConfirmpassword());
				     userModel.setPassword(encodedPassword);
				     userModel.setConfirmpassword(encodedPassword1);
				userService.changePassword(u, encodedPassword, encodedPassword1);
				
				return "login";

			} 
			
			else {
				logger.info("Error");
				model.addAttribute("error", "Password and Confirm Password doesnot match");
				logger.debug("Password does not match");
				return "forgotpassword";
			}
		
		}
		

		if (du != null) {
			if ((du.getOtp()==otp)&&(doctorUserModel.getPassword().equals(doctorUserModel.getConfirmpassword()))) {
				logger.info("Going to login page");
				
				  String encodedPassword = this.bCryptPasswordEncoder.encode(doctorUserModel.getPassword());
				     String encodedPassword1 = this.bCryptPasswordEncoder.encode(doctorUserModel.getConfirmpassword());
				     doctorUserModel.setPassword(encodedPassword);
				     doctorUserModel.setConfirmpassword(encodedPassword1);
				doctorUserService.changePassword(du, encodedPassword, encodedPassword1);
				logger.debug("Successfully logged in");
				return "login";

			} else {
				logger.info("Comparing the password and confirmpassword");
				model.addAttribute("error", "Password and Confirm Password doesnot match");
				logger.debug("Password mismatched");
				return "forgotpassword";
			}
		}
		model.addAttribute("error", "Invalid Email");
		return "forgotpassword";

	}

	/* This method helps to update the doctor comments */
	@GetMapping("/forgotpassword")
	public String updatePassword() {
		logger.info("Changing password");
		logger.debug("Successfully changed");
		return "forgotpassword";
	}

	@PostMapping("/sendotp")
	public String sendOTP(@RequestParam("email") String email, @ModelAttribute UserModel userModel,
			@ModelAttribute DoctorUserModel doctorUserModel) {
		User u = null;
		DoctorUser du = null;
		try {
			u = userService.findByEmail(email);
			du = doctorUserService.findByEmail(email);
		} catch (Exception e) {
			logger.info("Checking user");
			System.out.println("User not found !!!");
			logger.debug("USer not found");
		}
		int otpgenerated = (int) Math.floor(Math.random() * 1000000);
		if (u != null) {
			System.out.println("test1");
			userService.setOtp(u,otpgenerated);
		}
		if (du != null) {
			System.out.println("test2");
			doctorUserService.setOtp(du,otpgenerated);
		}
	
		String to =email;
		String subject = "OTP Generation";
		String text ="OTP is: "+otpgenerated;
		emailService.SendMail( to, subject, text);
		System.out.println(text);
	

		return "forgotpassword";
	}

	@GetMapping("/sendotp")
	public String Passwordverify() {
		logger.info("Sending OTP");
		logger.debug("Successfully sent");
		return "sendotp";
	}

	/* Comment List */
	@GetMapping("/commentlist") // staff
	public String Comments(Model model) {
		logger.info("Showing commentlist");
		model.addAttribute("d", doctorService.getAllDoctorComments());
		logger.debug("Successfully displayed");
		return "commentlist";
	}

	/* Logout */
	@GetMapping("/logout")
	public String logout() {
		logger.info("Logging out");
		logger.debug("Successfully logged out");
		return "index";
	}

}
