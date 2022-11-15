package com.valtech.health.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Service;

import com.valtech.health.app.entity.DoctorUser;
import com.valtech.health.app.entity.PatientDetails;
import com.valtech.health.app.entity.User;

import com.valtech.health.app.repostitory.UserRepository;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
@Override
	public User createUser(User u){
		return userRepository.save(u);
		}

@Override
public void deleteUser(User user) {
	userRepository.delete(user);
}

@Override
public User findByEmail(String email) {
    return userRepository.findByEmail(email);
}
@Override
public User findByUsername(String username) {
    return userRepository.findByUsername(username);
}
@Override
public User findByPassword(String password) {
    return userRepository.findByPassword(password);
}
}
