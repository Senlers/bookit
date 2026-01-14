package com.bookit.user.domain;

public class User {

    private String email;
    private String hash_password;

    public User(String email, String hash_password) {
        this.email = email;
        this.hash_password = hash_password;
    }

    public String getEmail() {
        return email;
    }

    public String getHash_password() {
        return hash_password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHash_password(String hash_password) {
        this.hash_password = hash_password;
    }
}
