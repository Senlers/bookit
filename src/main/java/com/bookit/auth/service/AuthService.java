package com.bookit.auth.service;

import com.bookit.auth.dto.AuthResponse;

public class AuthService {

    private String email;
    private String password;

    public AuthService(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public AuthResponse login(String mail, String secret) {
        return new AuthResponse();
    }

}
