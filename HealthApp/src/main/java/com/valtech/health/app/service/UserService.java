package com.valtech.health.app.service;

import com.valtech.health.app.entity.User;

public interface UserService {

	User createUser(User u);

	void deleteUser(User user);

}
