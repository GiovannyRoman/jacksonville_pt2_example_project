package com.cooksys.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cooksys.entity.AppUser;
import com.cooksys.model.GetAllUsersResponse;
import com.cooksys.repository.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    EntityManager em;

    @Override
    public AppUser get(long id) {
        return em.createQuery("select user from AppUser user where user.id = :id", AppUser.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public List<GetAllUsersResponse> getAll() {
        return em.createQuery("select new com.cooksys.model.GetAllUsersResponse(user.id, user.name) from AppUser user", GetAllUsersResponse.class).getResultList();
    }

}
