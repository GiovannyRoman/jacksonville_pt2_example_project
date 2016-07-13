package com.cooksys.repository;

import java.util.List;

import com.cooksys.entity.AppUser;
import com.cooksys.model.GetAllUsersResponse;

public interface UserRepository {

	AppUser get(long id);

	List<GetAllUsersResponse> getAll();
}