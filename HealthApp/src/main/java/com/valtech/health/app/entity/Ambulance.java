package com.valtech.health.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ambulance {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String hospitalAvailability;
	private String doctorsAvailability;
	private String bedAvailability;

	public Ambulance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ambulance(int id, String hospitalAvailability, String doctorsAvailability, String bedAvailability) {
		super();
		this.id = id;
		this.hospitalAvailability = hospitalAvailability;
		this.doctorsAvailability = doctorsAvailability;
		this.bedAvailability = bedAvailability;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHospitalAvailability() {
		return hospitalAvailability;
	}

	public void setHospitalAvailability(String hospitalAvailability) {
		this.hospitalAvailability = hospitalAvailability;
	}

	public String getDoctorsAvailability() {
		return doctorsAvailability;
	}

	public void setDoctorsAvailability(String doctorsAvailability) {
		this.doctorsAvailability = doctorsAvailability;
	}

	public String getBedAvailability() {
		return bedAvailability;
	}

	public void setBedAvailability(String bedAvailability) {
		this.bedAvailability = bedAvailability;
	}

	@Override
	public String toString() {
		return "Ambulance [id=" + id + ", hospitalAvailability=" + hospitalAvailability + ", doctorsAvailability="
				+ doctorsAvailability + ", bedAvailability=" + bedAvailability + "]";
	}


	


}
