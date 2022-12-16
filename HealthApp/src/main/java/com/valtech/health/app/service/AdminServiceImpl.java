package com.valtech.health.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.valtech.health.app.entity.Admin;
import com.valtech.health.app.repostitory.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminRepository adminRepository;

	/* This method creates Ambulance */
	@Override
	public Admin createAvailability(Admin a) {
		return adminRepository.save(a);
	}

	/* This method lists all Ambulance */
	@Override
	public List<Admin> getAllAvailability() {
		return adminRepository.findAll();
	}

}
