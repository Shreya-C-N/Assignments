package com.valtech.health.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String hospitalName;
	private String location;
	private String doctorsAvailability;
	private String bedAvailability;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(int id,  String hospitalName, String location,String doctorsAvailability,
			String bedAvailability) {
		super();
		this.id = id;
		this.hospitalName = hospitalName;
		this.location=location;
		this.doctorsAvailability = doctorsAvailability;
		this.bedAvailability = bedAvailability;
	}

	public Admin(String hospitalName,String location, String doctorsAvailability,
			String bedAvailability) {
		super();

		this.hospitalName = hospitalName;
		this.location=location;
		this.doctorsAvailability = doctorsAvailability;
		this.bedAvailability = bedAvailability;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	
	

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
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
		return "Ambulance [id=" + id + ",  hospitalName="
				+ hospitalName + ", location=" + location + ", doctorsAvailability=" + doctorsAvailability
				+ ", bedAvailability=" + bedAvailability + "]";
	}



}
