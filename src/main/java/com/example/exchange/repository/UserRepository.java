package com.example.exchange.repository;

import com.example.exchange.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String > {
    User findByUserId(String userId);
}
