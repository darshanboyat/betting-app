package com.app.payload.response;

public class Register {
	private Boolean error;
	private Boolean success;
	private String message;
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
	public Register(Boolean error, Boolean success, String message) {
		super();
		this.error = error;
		this.success = success;
		this.message = message;
	}
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Register [error=" + error + ", success=" + success + ", message=" + message + "]";
	}
	
	
}
