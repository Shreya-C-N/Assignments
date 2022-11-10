package com.valtech.health.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.health.app.entity.PatientDetails;
import com.valtech.health.app.repostitory.PatientDetailsRepository;

@Service
public class PatientDetailsServiceImpl implements PatientDetailsService {
	@Autowired
	private PatientDetailsRepository patientDetailsRepository;
	
@Override
	public PatientDetails createPatientDetails(PatientDetails p){
		return patientDetailsRepository.save(p);
		}
@Override

public List<PatientDetails>getAllPatientDetails(){
	return patientDetailsRepository.findAll();
}
}
