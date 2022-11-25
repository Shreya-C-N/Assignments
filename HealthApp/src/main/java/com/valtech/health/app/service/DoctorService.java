package com.valtech.health.app.service;

import java.util.List;

import com.valtech.health.app.entity.Doctor;
import com.valtech.health.app.entity.User;

public interface DoctorService {

	Doctor createDoctor(Doctor d);

	Doctor findByDoctorsname(String doctorsname);
	
	List<Doctor> getAllDoctorComments();

	Doctor getDoctorCommentById(int id);

	Doctor updateDoctorComments(Doctor d);


	
}
