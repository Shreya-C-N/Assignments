package com.valtech.health.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.health.app.entity.Hospital;
import com.valtech.health.app.entity.PatientDetails;
import com.valtech.health.app.entity.User;
import com.valtech.health.app.repostitory.HospitalRepository;



@Service
public class HospitalServiceImpl implements HospitalService  {
	@Autowired
	private HospitalRepository hospitalRepository;
	@Override
	public Hospital createHospital(Hospital h){
		return hospitalRepository.save(h);
		}
	@Override
	public List<Hospital>getAllHospitals(){
		return hospitalRepository.findAll();
	}
	@Override
	public void deleteHospital(Integer id) {
		hospitalRepository.deleteById(id);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Hospital updateHospitalDetails(Hospital h) {
		// TODO Auto-generated method stub
		return hospitalRepository.save(h);
	}
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Hospital getHospitalById(int id) {
		// TODO Auto-generated method stub
		return hospitalRepository.getReferenceById(id);
	}

}
