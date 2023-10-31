package com.app.payload.response;

import com.app.entity.UserEntity;

public class Login {
	private Boolean error;
	private Boolean success;
	private String message;
	private UserEntity user;
	private String jwt;
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(Boolean error, Boolean success, String message, UserEntity user, String jwt) {
		super();
		this.error = error;
		this.success = success;
		this.message = message;
		this.user = user;
		this.jwt = jwt;
	}
	public Boolean getError() {
		return error;
	}

	public void setError(Boolean error) {
		this.error = error;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}

	@Override
	public String toString() {
		return "Login [error=" + error + ", success=" + success + ", user=" + user + ", jwt=" + jwt + "]";
	}
}
