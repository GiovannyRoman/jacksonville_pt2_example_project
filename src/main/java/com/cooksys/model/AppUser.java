package com.cooksys.model;

import javax.persistence.*;

@Entity
@Table(name = "AppUser")
public class AppUser {

	@Id
	@GeneratedValue
	private long id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "CITY")
	private String city;

	@Column(name = "STATE")
	private String state;

	public AppUser() {

	}
	
	public AppUser(String name, String city, String state) {
		this.name = name;
		this.city = city;
		this.state = state;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}

}
