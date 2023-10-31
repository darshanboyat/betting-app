package com.app.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class LoginDto {
	@Email
	private String email;
	
	@NotEmpty
	@Size(min=4, max=16, message="Password must have minimum 4 character and maximum 16")
	private String password;
	public LoginDto(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public LoginDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
