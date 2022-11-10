package com.valtech.health.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.health.app.entity.Doctor;
import com.valtech.health.app.repostitory.DoctorRepository;


@Service
public class DoctorServiceImpl implements DoctorService {
	@Autowired
	private DoctorRepository doctorRepository;
	
@Override
	public Doctor createDoctor(Doctor d){
		return doctorRepository.save(d);
		}
@Override
@Transactional(propagation=Propagation.REQUIRED)
public List<Doctor>getAllComments(){
	return doctorRepository.findAll();
}
}
