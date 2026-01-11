package com.bookit.auth.controller;

import com.bookit.auth.dto.AuthResponse;
import com.bookit.auth.dto.LoginRequest;
import com.bookit.auth.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService=authService;
    }

    @PostMapping("/login")
    public AuthResponse login_request(@Valid @RequestBody LoginRequest req){
        return authService.login(req.getEmail(), req.getPassword());
    }

}
