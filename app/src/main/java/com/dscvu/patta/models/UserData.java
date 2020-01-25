package com.dscvu.patta.models;

public class UserData {
    private String Authorization;
    private User user;

    public UserData(String authorization, User user) {
        Authorization = authorization;
        this.user = user;
    }

    public String getAuthorization() {
        return Authorization;
    }

    public void setAuthorization(String authorization) {
        Authorization = authorization;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
