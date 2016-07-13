package com.cooksys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cooksys.entity.AppUser;

public interface SpringDataUserRepository extends JpaRepository<AppUser, Long> {
	
	//literally fu*king nothing

}
