package com.valtech.health.app.repostitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valtech.health.app.entity.DoctorUser;

@Repository
public interface DoctorUserRepository  extends JpaRepository<DoctorUser, Integer> {

	DoctorUser findByEmail(String email);
	
	DoctorUser findByUsername(String username);
	
	DoctorUser findByPassword(String password);

	DoctorUser findUsernameById(int id);

	DoctorUser findIdByUsername(String username);

	DoctorUser findByName(String name);
	
	



}