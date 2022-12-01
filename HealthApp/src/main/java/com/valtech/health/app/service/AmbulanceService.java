package com.valtech.health.app.service;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.health.app.entity.Ambulance;
import com.valtech.health.app.entity.PatientDetails;

public interface AmbulanceService {

	Ambulance createAmbulance(Ambulance a);



}