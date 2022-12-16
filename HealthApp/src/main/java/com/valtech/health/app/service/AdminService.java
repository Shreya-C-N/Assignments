package com.valtech.health.app.service;

import java.util.List;
import com.valtech.health.app.entity.Admin;

public interface AdminService {

	/* This method creates Ambulance */
	Admin createAvailability(Admin a);

	/* This method lists all Ambulance */
	List<Admin> getAllAvailability();

}