package com.valtech.health.app.entity;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;

	@Entity
	public class DoctorUser {
		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE)
		private int id;
		@Column(unique = true)
		private String name;
		private int number;
		private String email;
		@Column(unique = true)
		private String username;
		private String password;
		private String confirmpassword;

		public DoctorUser() {
			super();
			// TODO Auto-generated constructor stub
		}

		public DoctorUser(String name, int number, String email, String username, String password, String confirmpassword) {
			super();

			this.name = name;
			this.number = number;
			this.email = email;
			this.username = username;
			this.password = password;
			this.confirmpassword = confirmpassword;
		}

		public DoctorUser(int id, String name, int number, String email, String username, String password,
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

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
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
