package com.valtech.health.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valtech.health.app.repostitory.UserRepository;

@Service
public class UserService {
	@Autowired
    private UserRepository userRepository;
}
