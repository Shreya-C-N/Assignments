package com.valtech.health.app.model;

import javax.persistence.Column;

public class DoctorModel {
	private int id;
	private String name;
	private String doctor_comments;
	
	
	public DoctorModel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DoctorModel(String name, String doctor_comments) {
		super();
		this.name = name;
		this.doctor_comments = doctor_comments;
	}


	public DoctorModel(int id, String name, String doctor_comments) {
		super();
		this.id = id;
		this.name = name;
		this.doctor_comments = doctor_comments;
	}


	@Override
	public String toString() {
		return "DoctorModel [id=" + id + ", name=" + name + ", doctor_comments=" + doctor_comments + "]";
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


	public String getDoctor_comments() {
		return doctor_comments;
	}


	public void setDoctor_comments(String doctor_comments) {
		this.doctor_comments = doctor_comments;
	}
	
	
	
}
