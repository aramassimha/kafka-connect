package com.samarait.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samarait.model.User;
import com.samarait.service.UserService;
import java.util.*;
@RestController
@RequestMapping("/user")
public class UserController {
	
	private UserService userService;
	
	public  UserController(UserService userService) {
		this.userService = userService;
		
		
	}
	
	@PostMapping
	public  String create(@RequestBody User user) {
		
		userService.createUser(user);
		
		return "User is saved successful";
		
	}
	
	@GetMapping("/{userId}")
	public Optional<User> getOne(@PathVariable Integer userId) {
		return userService.getUser(userId);
	}
	
	@GetMapping
	public List<User> getAll() {
		return userService.getAllUsers();
	}
	
	
	

}
