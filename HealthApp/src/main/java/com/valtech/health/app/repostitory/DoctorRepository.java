package com.valtech.health.app.repostitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valtech.health.app.entity.Doctor;
import com.valtech.health.app.entity.DoctorUser;
import com.valtech.health.app.entity.User;

@Repository
public interface DoctorRepository  extends JpaRepository<Doctor, Integer> {
	/*Doctor findByDoctorsname(String doctorsname);*/

}
