package com.dscvu.patta.models;

import java.util.Date;

public class User {
    private int id;
    private String email;
    private String name;
    private Boolean admin;
    private Date created_at;
    private Boolean confirmed;

    public User(int id, String email, String name, Boolean admin, Date created_at, Boolean confirmed) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.admin = admin;
        this.created_at = created_at;
        this.confirmed = confirmed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Boolean getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }
}
