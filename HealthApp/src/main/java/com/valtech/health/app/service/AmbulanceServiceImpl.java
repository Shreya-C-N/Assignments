package com.valtech.health.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.health.app.entity.Ambulance;
import com.valtech.health.app.entity.PatientDetails;
import com.valtech.health.app.repostitory.AmbulanceRepository;
import com.valtech.health.app.repostitory.PatientDetailsRepository;

@Service
public class AmbulanceServiceImpl implements AmbulanceService {
	@Autowired
	private AmbulanceRepository ambulanceRepository;
	@Override
	public Ambulance createAmbulance(Ambulance a){
		return ambulanceRepository.save(a);
		}

	
}
