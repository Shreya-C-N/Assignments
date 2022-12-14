package com.valtech.health.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "DoctorUser", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class DoctorUser {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;

	@NotBlank(message = "Name cannot be empty!!")
	private String name;
	private String number;
	@Column(nullable = false, unique = true)
	private String email;
	@Column(nullable = false, unique = true)
	private String username;
	private String password;
	private String confirmpassword;
	private String role;
	@Column(nullable=true)
	private int otp;

	public DoctorUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DoctorUser(String name, String number, String email, String username, String password,
			String confirmpassword,String role,int otp) {
		super();

		this.name = name;
		this.number = number;
		this.email = email;
		this.username = username;
		this.password = password;
		this.confirmpassword = confirmpassword;
		this.role = role;
		this.otp=otp;
	}

	public DoctorUser(int id, String name, String number, String email,  String username,
			String password, String confirmpassword,String role,int otp) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.email = email;
		this.username = username;
		this.password = password;
		this.confirmpassword = confirmpassword;
		this.role = role;
		this.otp=otp;
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

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}

	@Override
	public String toString() {
		return "DoctorUser [id=" + id + ", name=" + name + ", number=" + number + ", email=" + email + ", username="
				+ username + ", password=" + password + ", confirmpassword=" + confirmpassword + ", role=" + role + "]";
	}

	

}
