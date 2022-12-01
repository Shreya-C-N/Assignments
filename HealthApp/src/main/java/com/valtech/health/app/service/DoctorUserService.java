package com.valtech.health.app.service;

import com.valtech.health.app.entity.DoctorUser;
import com.valtech.health.app.entity.User;

public interface DoctorUserService {

	DoctorUser createDoctorUser(DoctorUser d1);

	void deleteDoctorUser(DoctorUser d1);

	DoctorUser findByEmail(String email);

	DoctorUser findByUsername(String username);

	DoctorUser findByPassword(String password);

	DoctorUser getUsername(int id);

	int getIdbyUsername(String username);

	Boolean findByName(String name);



}
