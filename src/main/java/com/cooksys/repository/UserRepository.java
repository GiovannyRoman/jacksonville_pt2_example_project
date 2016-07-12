package com.cooksys.repository;

import com.cooksys.model.AppUser;

import java.util.List;

public interface UserRepository {

	AppUser get(long id);

	List<AppUser> getAll();
}
