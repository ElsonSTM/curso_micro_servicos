package com.example.hroauth.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hroauth.entities.User;
import com.example.hroauth.feignclients.UserFeignClient;

@Service
public class UserService {
	
	Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserFeignClient userFeignClient;
	
	public User findbyEmail(String email) {
		User user = userFeignClient.findByEmail(email).getBody();
		if(user == null) {
			
			throw new IllegalArgumentException("Email não existe");
		}
		logger.info("Email found: " + email);
		return user;
	}
}
