package com.cooksys.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cooksys.model.AppUser;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

	@Autowired
	EntityManager em;
	
	public AppUser get()
	{
		return new AppUser("Michael Boren", "Memphis", "Tennessee");
	}

	public List<AppUser> getAll() {
		List<AppUser> result = new ArrayList<>();

		result.add(new AppUser("Michael Boren", "Memphis", "Tennessee"));
		result.add(new AppUser("Dillon Callis", "Memphis", "Tennessee"));
		result.add(new AppUser("Dave Chris", "Anchorage", "Alaska"));

		return result;
	}
}
