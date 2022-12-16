package com.valtech.health.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.valtech.health.app.entity.DoctorUser;
import com.valtech.health.app.repostitory.DoctorUserRepository;

@Service
public class DoctorUserServiceImpl implements DoctorUserService {
    
	@Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	private DoctorUserRepository doctorUserRepository;
	
	 public DoctorUserServiceImpl(DoctorUserRepository doctorUserRepository){
	        this.doctorUserRepository = doctorUserRepository;
	        this.bCryptPasswordEncoder = new BCryptPasswordEncoder();
	    }
	 
	


	/* This method creates Doctor */
	@Override
	public DoctorUser createDoctorUser(DoctorUser d1) {
		String encodedPassword = this.bCryptPasswordEncoder.encode(d1.getPassword());
		String encodedPassword1 = this.bCryptPasswordEncoder.encode(d1.getConfirmpassword());
		d1.setPassword(encodedPassword);
		d1.setConfirmpassword(encodedPassword1);
		return doctorUserRepository.save(d1);
	}

	/* This method finds Doctor by their Email */
	@Override
	public DoctorUser findByEmail(String email) {
		return doctorUserRepository.findByEmail(email);
	}

	/* This method finds Doctor by name */
	@Override
	public Boolean findByName(String name) {
		if (doctorUserRepository.findByName(name) != null)
			return true;
		return false;
	}

	/* This method finds Doctor by their user name */
	@Override
	public DoctorUser findByUsername(String username) {
		return doctorUserRepository.findByUsername(username);
	}

	/* This method lists all the doctors */
	@Override
	public List<DoctorUser> getAllDoctors() {
		return doctorUserRepository.findAll();
	}

	/* This method finds Doctor by their Password */
	@Override
	public DoctorUser findByPassword(String password) {
		return doctorUserRepository.findByPassword(password);
	}

	/* This method retrieves Doctor's user name by their ID */
	@Override
	public DoctorUser getUsername(int id) {
		// TODO Auto-generated method stub
		return doctorUserRepository.findUsernameById(id);
	}

	/* This method retrieves Doctor's ID by user name */
	@Override
	public int getIdbyUsername(String username) {
		DoctorUser du = doctorUserRepository.findByUsername(username);
		return du.getId();
	}
	
	@Override
	public String getEmailByName(String doctorsname) {
		DoctorUser du = doctorUserRepository.findByName(doctorsname);
		return du.getEmail();
		
	}

	@Override
	public DoctorUser changePassword(DoctorUser u, String password, String confirmpassword) {
		u.setPassword(password);
		u.setConfirmpassword(confirmpassword);
		return doctorUserRepository.save(u);
	}
	
	@Override
	public void setOtp(DoctorUser du,int otp){
		du.setOtp(otp);
		doctorUserRepository.save(du);
	}
	

	@Override
	public DoctorUser findByOtp(int otp) {
		return doctorUserRepository.findByOtp(otp);
	}

}