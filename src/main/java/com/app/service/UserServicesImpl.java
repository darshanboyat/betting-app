package com.app.service;


import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.app.dto.LoginDto;
import com.app.dto.UserDto;
import com.app.entity.UserEntity;
import com.app.payload.response.Login;
import com.app.payload.response.Register;
import com.app.repo.UserRepo;

@Service
public class UserServicesImpl implements UserServices {

	@Autowired
	private UserRepo userRepo;
	@Autowired
	private PasswordEncoder passwordEncoder;

	public UserServicesImpl() {
		// TODO Auto-generated constructor stub
	}

	public static String referralGeneration() {
		final String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_+=";
		StringBuilder referralId = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 4; i++) {
			int index = random.nextInt(characters.length());
			referralId.append(characters.charAt(index));
		}
		String finalReferralId = "" + System.currentTimeMillis();

		return finalReferralId.concat(referralId.toString());
	}

	@Override
	public Register addUser(UserDto userDto) {
		UserEntity userExist = userRepo.findByEmail(userDto.getEmail());
		String referrer = "";
		if (userDto.getReferBy() != null || userDto.getReferBy() != "") {
//			userRepo.findByReferIdAndUpdate(userDto.getReferBy(), userDto.getReferCount() + 1);
			referrer = userDto.getReferBy();
		}

		if (userExist == null) {
			UserEntity user = new UserEntity(userDto.getId(), userDto.getName(), userDto.getEmail(),
					this.passwordEncoder.encode(userDto.getPassword()), userDto.getUsername(), userDto.getPhone(),
					userDto.getBirthday(), userDto.getGender(), userDto.getCountry(), userDto.getCity(),
					userDto.getCurrency(), referrer, referralGeneration(), 0);
			userRepo.save(user);
			return new Register(false, true, "User Registered Successfully....");
		} else {
			return new Register(true, false, "An User Already Exists With This Email!!");
		}
	}

	@Override
	public Login login(LoginDto loginDto) {
		UserEntity user = null;
		try {
			user = userRepo.findByEmail(loginDto.getEmail());
		} catch (Exception e) {
			// Log the exception
			e.printStackTrace();
		}
		System.out.println(loginDto.getEmail() + "   " + user);
		if (user != null) {
			String password = loginDto.getPassword();
			String encodedPass = user.getPassword();

			Boolean isMatches = passwordEncoder.matches(password, encodedPass);

			if (isMatches) {
				return new Login(false, true, "User Login Successfully...", user, null);
			} else {
				return new Login(true, false, "Invalid Username Or Password", null, null);
			}
		} else {
			return new Login(true, false, "This Email Doesn't Exists!!", null, null);
		}
	}

}
