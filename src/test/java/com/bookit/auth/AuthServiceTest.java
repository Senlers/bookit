package com.bookit.auth;

import com.bookit.user.dao.UserDao;
import com.bookit.auth.dto.AuthResponse;
import com.bookit.auth.service.AuthService;
import com.bookit.user.domain.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AuthServiceTest {
    @Mock
    private UserDao userDao;

    @InjectMocks
    private AuthService authService;

    @Test
    void correct_credentials_assertToken(){
        User user = new User("a@b.com", "hashed_password");
        when(userDao.findEmail("a@b.com"))
                .thenReturn(new User("a@b.com","hashed_password"));
        when(passwordEncoder.matches("correct", "hashed_password"))
                .thenReturn(true);
        when(jwtService.generateToken(user))
                .thenReturn("jwt123");
        AuthResponse authResponse=authService.login("a@b.com","correct");

        String token=authResponse.getToken();
        assertEquals("jwt123", token);

    }

}
