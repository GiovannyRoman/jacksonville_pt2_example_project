package com.cooksys.repository;

import com.cooksys.model.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

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
    public List<AppUser> getAll() {
        return em.createQuery("select user from AppUser user", AppUser.class).getResultList();
    }

}
