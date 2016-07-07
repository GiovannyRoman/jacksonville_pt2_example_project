package com.cooksys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.entity.AppUser;
import com.cooksys.model.GetAllUsersResponse;
import com.cooksys.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/{id}")
	public AppUser user(@PathVariable("id") long id) {
		return userRepository.get(id);
	}

	@RequestMapping("allUsers")
	public List<GetAllUsersResponse> allUsers() {
		return userRepository.getAll();
	}

}
