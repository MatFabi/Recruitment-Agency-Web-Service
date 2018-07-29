package com.ctime.user;

import javax.validation.constraints.NotNull;

import javax.validation.constraints.Size;

import org.springframework.security.core.userdetails.User;



public class CtimeUser{
		
	private String username;
		
	private String password;
		
	private String firstName;
	
	private String lastName;

	private String companyName;
	

	private String companyEmail;
		
	public CtimeUser() {
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyEmail() {
		return companyEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
