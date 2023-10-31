package com.app.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class UserEntity {

	@Id
	@Column(name="userId", length=45)
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	
	@Column(name="name", length=40)
	private String name;
	
	@Column(name="email", length=100)
	private String email;
	
	@Column(name="password", length=100)
	private String password;
	
	@Column(name="username", length=255)
	private String username;
	
	@Column(name="phone", length=255)
	private long phone;


	@Column(name="birthday", length=50)
	private String birthday;
	
	@Column(name="gender", length=50)
	private String gender;
	
	@Column(name="country", length=50)
	private String country;
	
	@Column(name="city", length=50)
	private String city;
	
	@Column(name="currency", length=50)
	private String currency;
	
	@Column(name="referrer", length=50)
	private String referBy;

	@Column(name="referral", length=50)
	private String referral;
	
	@Column(name="refer_count", length=50)
	private Integer referCount;

	public UserEntity(int id, String name, String email, String password, String username, long phone, String birthday,
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

	public UserEntity() {
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
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
