package com.valtech.health.app.service;

import java.util.List;

import com.valtech.health.app.entity.Doctor;

public interface DoctorService {

	Doctor createDoctor(Doctor d);

	List<Doctor> getAllDoctorComments();

	Doctor getDoctorCommentById(int id);

	Doctor updateDoctorComments(Doctor d);


	
}
