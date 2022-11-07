package com.valtech.health.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Staff {

	private String name;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private int phnumber;
	
	
	public Staff() {}
	
	
	
	
	@Override
	public String toString() {
		return "Staff [name=" + name + ", id=" + id + ", phnumber=" + phnumber + "]";
	}




	public Staff(String name, int id, int phnumber) {
		super();
		this.name = name;
		this.id = id;
		this.phnumber = phnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPhnumber() {
		return phnumber;
	}
	public void setPhnumber(int phnumber) {
		this.phnumber = phnumber;
	}
	
	
	
}
