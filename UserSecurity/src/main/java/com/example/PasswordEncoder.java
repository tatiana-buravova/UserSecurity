package com.example;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {
	
	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	String rawPassword = "novak";
	String encodedPassword = encoder.encode(rawPassword);
}
