package com.example.exchange.service;

import com.example.exchange.entity.Question;
import com.example.exchange.entity.Tag;
import com.example.exchange.entity.User;
import com.example.exchange.model.QuestionInputModel;
import com.example.exchange.model.TagModel;
import com.example.exchange.model.UserEditProfileInputModel;
import com.example.exchange.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void save(User user) {
        user.setPassword(user.getPassword());
        userRepository.save(user);
    }

    @Override // TODO: moi chi cho phep update description
    public User update(UserEditProfileInputModel input){
        User user = userRepository.findByUserId(input.getUserId());
        user.setDescription(input.getDescription());
        userRepository.save(user);
        return user;
    }

    @Override
    public User findByUserName(String username) {
        return userRepository.findByUserName(username);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User authenticateUser(String username, String password) {
        User user = findByUserName(username);
        if(user != null){
            if(user.getPassword().equals(password)){
                System.out.println(user.getUserName());
                return user;
            }
        }
        return null;
    }

    @Override
    public User findByUserId(Integer userId) {
        User user = userRepository.findByUserId(userId);
        return user;
    }
}
