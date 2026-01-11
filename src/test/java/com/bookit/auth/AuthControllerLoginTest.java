package com.bookit.auth;

import com.bookit.auth.controller.AuthController;
import com.bookit.auth.dto.AuthResponse;
import com.bookit.exception.InvalidCredentialsException;
import com.bookit.auth.service.AuthService;
import org.springframework.http.MediaType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(AuthController.class)
class AuthControllerLoginTest {

    @Autowired
    MockMvc mvc;
    @MockitoBean
    AuthService authService;

    @Test
    void login_returnsToken_onValidCredentials() throws Exception {
        when(authService.login("a@b.com", "correct"))
                .thenReturn(new AuthResponse("jwt123", "Bearer"));

        mvc.perform(post("/api/auth/login")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"email\":\"a@b.com\",\"password\":\"correct\"}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.token").value("jwt123"))
                .andExpect(jsonPath("$.tokenType").value("Bearer"));

    }

    @Test
    void login_returns401_onBadCredentials() throws Exception {
        when(authService.login("a@b.com", "wrong"))
                .thenThrow(new InvalidCredentialsException());

        mvc.perform(post("/api/auth/login")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"email\":\"a@b.com\",\"password\":\"wrong\"}"))
                .andExpect(status().isUnauthorized())
                .andExpect(jsonPath("$.error").value("INVALID_CREDENTIALS"));
    }

}
