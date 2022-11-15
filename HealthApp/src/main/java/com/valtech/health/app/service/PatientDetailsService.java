package com.valtech.health.app.service;

import java.util.List;

import com.valtech.health.app.entity.Doctor;
import com.valtech.health.app.entity.PatientDetails;


public interface PatientDetailsService {

	PatientDetails createPatientDetails(PatientDetails p);

	List<PatientDetails> getAllPatientDetails();

	PatientDetails updatePatientsDetails(PatientDetails p);

	PatientDetails getPatientById(int id);

}

