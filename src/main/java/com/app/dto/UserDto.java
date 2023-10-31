package com.app.dto;

public class UserDto {

	private int id;
	private String name;
	private String email;
	private String password;
	private String username;
	private long phone;
	private String birthday;
	private String gender;
	private String country;
	private String city;
	private String currency;
	private String referBy;
	private String referral;
	private Integer referCount;
	public UserDto(int id, String name, String email, String password, String username, long phone, String birthday,
			String gender, String country, String city, String currency, String referBy, String referral,
			Integer referCount) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.username = username;
		this.phone = phone;
		this.birthday = birthday;
		this.gender = gender;
		this.country = country;
		this.city = city;
		this.currency = currency;
		this.referBy = referBy;
		this.referral = referral;
		this.referCount = referCount;
	}
	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getReferBy() {
		return referBy;
	}
	public void setReferBy(String referBy) {
		this.referBy = referBy;
	}
	public String getReferral() {
		return referral;
	}
	public void setReferral(String referral) {
		this.referral = referral;
	}
	public Integer getReferCount() {
		return referCount;
	}
	public void setReferCount(Integer referCount) {
		this.referCount = referCount;
	}
}
