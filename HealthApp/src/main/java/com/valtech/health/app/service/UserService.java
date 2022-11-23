package com.valtech.health.app.service;

import com.valtech.health.app.entity.PatientDetails;
import com.valtech.health.app.entity.User;

public interface UserService {

	User createUser(User u);

	void deleteUser(User user);

	User findByEmail(String email);
	
	User findByUsername(String username);

	User findByPassword(String password);

	int getIdbyUsername(String string);

	User getUsername(int id);

	

}
