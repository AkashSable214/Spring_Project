package com.Spring_JPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Spring_JPA.entity.UserJpa;
import com.Spring_JPA.repo.UserRepo;

public class UserService {
	
	@Autowired
	UserRepo ur;
	
	public List<UserJpa> getAllData() {
		return ur.findAll();
	}

}
