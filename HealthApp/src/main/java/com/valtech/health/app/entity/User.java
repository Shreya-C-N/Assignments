package com.valtech.health.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;





@Entity
@Table(name="User",uniqueConstraints=@UniqueConstraint(columnNames="email"))
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	 @NotBlank(message="Name cannot be empty!!")
	 //@Size(min = 3, max=10,message="User name must be between 3-10 characters!!")
	private String name;

	private String number;
	 @Column(nullable=false, unique=true)
	
	private String email;
	 @Column(nullable=false, unique=true)
	// @Size(min = 3, max=10,message="username must be between 3-10 characters!!")
	private String username;
	// @Size(min = 3, max=10,message="password must be between 3-10 characters!!")
	private String password;
	private String confirmpassword;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String name, String number, String email, String username, String password, String confirmpassword) {
		super();

		this.name = name;
		this.number = number;
		this.email = email;
		this.username = username;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}

	public User(int id, String name, String number, String email, String username, String password,
			String confirmpassword) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.email = email;
		this.username = username;
		this.password = password;
		this.confirmpassword = confirmpassword;
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



}
