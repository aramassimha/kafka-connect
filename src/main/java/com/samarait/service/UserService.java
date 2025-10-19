package com.samarait.service;

import org.springframework.stereotype.Service;
import java.util.*;

import com.samarait.model.User;
import com.samarait.repository.UserRepository;

@Service
public class UserService {
	
	private UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	
	public User createUser(User user) {
		
		return userRepository.save(user);
		
		
		
	}

	public Optional<User> getUser(Integer userId) {
		
		return userRepository.findById(userId);
		
	}
	
	public List<User> getAllUsers() {
		return userRepository.findAll();
		
		
	}
	

}
