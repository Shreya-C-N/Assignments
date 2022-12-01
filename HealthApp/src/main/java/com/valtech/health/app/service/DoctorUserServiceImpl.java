package com.valtech.health.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Service;

import com.valtech.health.app.entity.DoctorUser;
import com.valtech.health.app.entity.PatientDetails;
import com.valtech.health.app.entity.User;
import com.valtech.health.app.repostitory.DoctorUserRepository;

@Service
public class DoctorUserServiceImpl implements DoctorUserService{
	
	@Autowired
	private DoctorUserRepository doctorUserRepository;
	
	@Override
	public DoctorUser createDoctorUser(DoctorUser d1){
		return doctorUserRepository.save(d1);
		}

@Override
public void deleteDoctorUser(DoctorUser d1){
	doctorUserRepository.delete(d1);
}

@Override
public DoctorUser findByEmail(String email) {
    return doctorUserRepository.findByEmail(email);
}

@Override
public Boolean findByName(String name) {
    if(doctorUserRepository.findByName(name)!=null)
        return true;
    return false;
}
/*@Override
public DoctorUser findByName(String name) {
    return doctorUserRepository.findByName(name);
}*/

@Override
public DoctorUser findByUsername(String username) {
    return doctorUserRepository.findByUsername(username);
}
@Override
public DoctorUser findByPassword(String password) {
    return doctorUserRepository.findByPassword(password);
}


@Override
public DoctorUser getUsername(int id) {
	// TODO Auto-generated method stub
	return  doctorUserRepository.findUsernameById(id);
}

@Override
public int getIdbyUsername(String username) {
	DoctorUser du = doctorUserRepository.findByUsername(username);
	return du.getId();
}




	
}