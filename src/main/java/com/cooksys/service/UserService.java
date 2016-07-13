package com.cooksys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cooksys.model.GetAllUsersResponse;
import com.cooksys.repository.SpringDataUserRepository;

@Service
public class UserService {
	
	@Autowired
	SpringDataUserRepository repo;
	
	public List<GetAllUsersResponse> getAll()
	{
		return GetAllUsersResponse.list(repo.findAll());
	}

}
