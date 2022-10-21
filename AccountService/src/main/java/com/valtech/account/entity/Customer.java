package com.valtech.account.entity;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String name;
private String email;
private String mobile;
private LocalDate birthdate;
private String address;
private String customerTypr;
private int pincode;

@ManyToMany(targetEntity=Account.class,cascade={CascadeType.PERSIST},fetch=FetchType.LAZY,mappedBy="customers")
private Set<Account>accounts;
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}



public Customer(int id, String name, String email, String mobile, LocalDate birthdate, String address,
		String customerTypr, int pincode) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.mobile = mobile;
	this.birthdate = birthdate;
	this.address = address;
	this.customerTypr = customerTypr;
	this.pincode = pincode;
}



public Customer(String name, String email, String mobile, LocalDate birthdate, String address, String customerTypr,
		int pincode) {
	super();
	this.name = name;
	this.email = email;
	this.mobile = mobile;
	this.birthdate = birthdate;
	this.address = address;
	this.customerTypr = customerTypr;
	this.pincode = pincode;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public LocalDate getBirthdate() {
	return birthdate;
}
public void setBirthdate(LocalDate birthdate) {
	this.birthdate = birthdate;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCustomerTypr() {
	return customerTypr;
}
public void setCustomerTypr(String customerTypr) {
	this.customerTypr = customerTypr;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}


}
