package com.valtech.health.app.service;

import java.util.List;

import com.valtech.health.app.entity.Hospital;

public interface HospitalService {

	Hospital createHospital(Hospital h);

	List<Hospital> getAllHospitals();

	Hospital updateHospitalDetails(Hospital h);

	Hospital getHospitalById(int id);

	

	void deleteHospital(Integer id);

}