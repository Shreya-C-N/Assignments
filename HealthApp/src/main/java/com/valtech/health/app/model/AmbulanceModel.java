package com.valtech.health.app.model;

import java.util.LinkedHashMap;

public class AmbulanceModel {

	private int id;
	private String hospitalAvailability;
	private String doctorsAvailability;
	private String bedAvailability;


	public AmbulanceModel() {
	
	}


	public AmbulanceModel(String hospitalAvailability, String doctorsAvailability, String bedAvailability) {
		super();
		this.hospitalAvailability = hospitalAvailability;
		this.doctorsAvailability = doctorsAvailability;
		this.bedAvailability = bedAvailability;
	}


	public AmbulanceModel(int id, String hospitalAvailability, String doctorsAvailability, String bedAvailability) {
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
		return "AmbulanceModel [id=" + id + ", hospitalAvailability=" + hospitalAvailability + ", doctorsAvailability="
				+ doctorsAvailability + ", bedAvailability=" + bedAvailability + "]";
	}
	


}
