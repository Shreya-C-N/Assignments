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
	@Column(unique = true)
	private String name;
	private String doctor_comments;
	
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Doctor(int id, String name, String doctor_comments) {
		super();
		this.id = id;
		this.name = name;
		this.doctor_comments = doctor_comments;
	}


	public Doctor(String name, String doctor_comments) {
		super();
		this.name = name;
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
	
	
}
