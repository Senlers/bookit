package com.bookit.auth.dto;

public class AuthResponse {

    private String token;
    private String tokenType;

    public AuthResponse() {}

    public AuthResponse(String token, String tokenType) {
        this.token=token;
        this.tokenType=tokenType;
    }

    public String getJwt() {
        return token;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setJwt(String jwt) {
        this.token = jwt;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }
}
