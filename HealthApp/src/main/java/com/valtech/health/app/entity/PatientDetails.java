package com.valtech.health.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PatientDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	@Column(nullable = false, unique = true)
	private String name;
	private int age;
	private String doctorsname;
	private String bloodgroup;
	private String disease;
	private String blood_pressure;
	private int pulse_rate;

	public PatientDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PatientDetails(int id, String name, int age, String doctorsname, String bloodgroup, String disease,
			String blood_pressure, int pulse_rate) {

		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.doctorsname = doctorsname;
		this.bloodgroup = bloodgroup;
		this.disease = disease;
		this.blood_pressure = blood_pressure;
		this.pulse_rate = pulse_rate;
	}

	public PatientDetails(String name, int age,String doctorsname, String bloodgroup, String disease,
			String blood_pressure, int pulse_rate) {
		super();
		this.name = name;
		this.age = age;
		this.doctorsname = doctorsname;
		this.bloodgroup = bloodgroup;
		this.disease = disease;
		this.blood_pressure = blood_pressure;
		this.pulse_rate = pulse_rate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDoctorsname() {
		return doctorsname;
	}

	public void setDoctorsname(String doctorsname) {
		this.doctorsname = doctorsname;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getBlood_pressure() {
		return blood_pressure;
	}

	public void setBlood_pressure(String blood_pressure) {
		this.blood_pressure = blood_pressure;
	}

	public int getPulse_rate() {
		return pulse_rate;
	}

	public void setPulse_rate(int pulse_rate) {
		this.pulse_rate = pulse_rate;
	}

	@Override
	public String toString() {
		return "PatientDetails [id=" + id + ", name=" + name + ", age=" + age 
				+ ", doctorsname=" + doctorsname + ", bloodgroup=" + bloodgroup + ", disease=" + disease
				+ ", blood_pressure=" + blood_pressure + ", pulse_rate=" + pulse_rate + "]";
	}

	





}
