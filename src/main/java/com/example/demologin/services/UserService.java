package com.example.demologin.services;

import com.example.demologin.domain.User;

public interface UserService {

	void save(User user);
	
	User findByUsername(String username);
	
}
