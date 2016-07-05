package com.cooksys.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cooksys.model.AppUser;

@Repository
public class UserRepository {

	@Autowired
	EntityManager em;
	
	public AppUser get()
	{
		return new AppUser("Michael Boren", "Memphis", "Tennessee");
	}
	
}
