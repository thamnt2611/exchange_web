package com.example.exchange.repository;

import com.example.exchange.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer > {
    User findByUserId(Integer userId);
    User findByUserName(String userName);
    List<User> findAll();
}
