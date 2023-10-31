package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.LoginDto;
import com.app.dto.UserDto;
import com.app.payload.response.Login;
import com.app.payload.response.Register;
import com.app.service.UserServices;

import jakarta.validation.Valid;

@CrossOrigin
@RestController
public class UserController {
	
	@Autowired
	private UserServices userService;
	
	@GetMapping("/test")
	public String test() {
		return "Working fine";
	}
	@PostMapping("/register")
	public ResponseEntity<?> save(@RequestBody UserDto userDto) {
			Register registerResponse = userService.addUser(userDto);
			return ResponseEntity.ok(registerResponse);
	}
	@PostMapping("/login")
	public ResponseEntity<?> login(@Valid @RequestBody LoginDto loginDto) {
		Login loginResponse = userService.login(loginDto);
		return ResponseEntity.ok(loginResponse);
	}
}
