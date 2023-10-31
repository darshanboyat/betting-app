package com.app.service;

import com.app.dto.LoginDto;
import com.app.dto.UserDto;
import com.app.payload.response.Login;
import com.app.payload.response.Register;

public interface UserServices {

	public Register addUser(UserDto userDto);
	public Login login(LoginDto userDto);

}
