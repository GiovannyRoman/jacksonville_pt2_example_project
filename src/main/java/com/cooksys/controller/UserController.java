package com.cooksys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.model.AppUser;
import com.cooksys.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("singleName")
	String helloSpring()
	{
		return "Michael Boren";
	}
	
	@RequestMapping("userObj")
	AppUser getUser()
	{
		return userRepository.get();
	}

	@RequestMapping("allUsers")
	List<AppUser> allUsers() {
		return userRepository.getAll();
	}

}
