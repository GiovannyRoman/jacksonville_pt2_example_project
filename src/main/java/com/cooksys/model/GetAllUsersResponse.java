package com.cooksys.model;

import javax.persistence.Entity;
import javax.persistence.Id;

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

}
