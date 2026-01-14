package com.bookit.user.dao;

import com.bookit.user.domain.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserDao {
    private final JdbcTemplate jdbc;

    public UserDao(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public Optional<User> findEmail(String email){

    }

}
