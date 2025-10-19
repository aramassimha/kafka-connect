package com.samarait.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samarait.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	

}
