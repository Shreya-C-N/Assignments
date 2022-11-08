package com.valtech.health.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
}
