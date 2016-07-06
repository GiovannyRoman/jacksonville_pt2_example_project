package com.cooksys.model;

import javax.persistence.*;

@Entity
@Table(name = "AppRole")
public class AppRole {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "Role")
    private String role;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
