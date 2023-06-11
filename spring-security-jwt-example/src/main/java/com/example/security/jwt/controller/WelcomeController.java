package com.example.security.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.security.jwt.entity.AuthenticationRequest;
import com.example.security.jwt.util.JwtUtil;

@RestController
public class WelcomeController {
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	private AuthenticationManager authManager;

	@GetMapping("/")
	public ResponseEntity<String> welcome() {
		return new ResponseEntity<String>("Welcome to JWT demo", HttpStatus.OK);
	}
	
	@PostMapping("/authenticate")
	public String generateToken(@RequestBody AuthenticationRequest authRequest) throws Exception {
		try {
			authManager.authenticate(
					new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword()));
		} catch (Exception ex) {
			throw new Exception("Invalid Credentials");
		}

		return jwtUtil.generateToken(authRequest.getUserName());
	}
}
