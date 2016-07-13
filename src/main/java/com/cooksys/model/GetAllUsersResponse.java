package com.cooksys.model;

import java.util.ArrayList;
import java.util.List;

import com.cooksys.entity.AppUser;

public class GetAllUsersResponse {
	
	private long id;
	
	private String name;
	
	public GetAllUsersResponse(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static List<GetAllUsersResponse> list(List<AppUser> list)
	{
		ArrayList<GetAllUsersResponse> result = new ArrayList<>();
		for(AppUser user : list)
			result.add(new GetAllUsersResponse(user.getId(), user.getName()));
		return result;
	}
}
