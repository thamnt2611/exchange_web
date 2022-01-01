package com.example.exchange.service;

import com.example.exchange.entity.User;
import com.example.exchange.model.UserEditProfileInputModel;
import java.util.List;

public interface UserService {
    void save(User user);

    User update(UserEditProfileInputModel user);

    User findByUserName(String username);

    List<User> findAllUsers();

    User authenticateUser(String username, String password);

    User findByUserId(Integer userId);
}
