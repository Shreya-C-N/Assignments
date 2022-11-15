package com.valtech.health.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	 @Column(nullable=false, unique=true)
	private String name;
	 @Column(nullable=false)
	private String patients_name;
	 @Column(nullable=false)
	private String doctor_comments;
	
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(int id, String name, String patients_name, String doctor_comments) {
		super();
		this.id = id;
		this.name = name;
		this.patients_name = patients_name;
		this.doctor_comments = doctor_comments;
	}


	public Doctor(String name, String patients_name, String doctor_comments) {
		super();
		this.name = name;
		this.patients_name = patients_name;
		this.doctor_comments = doctor_comments;
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

	public String getPatients_name() {
		return patients_name;
	}


	public void setPatients_name(String patients_name) {
		this.patients_name = patients_name;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", patients_name=" + patients_name + ", doctor_comments="
				+ doctor_comments + "]";
	}
	
}
