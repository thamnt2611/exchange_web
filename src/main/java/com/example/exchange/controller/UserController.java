package com.example.exchange.controller;

import com.example.exchange.model.UserInputModel;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class UserController {
    @GetMapping("/users")
    public ResponseEntity<?> getAllUsers(Pageable page){
        return null;
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<?> getUserById(@PathVariable String id){
        return null;
    }

    @GetMapping("/users/{id}/questions")
    public ResponseEntity<?> getUserQuestions(@PathVariable String id, Pageable page){
        return null;
    }

    @PostMapping("users/login")
    public ResponseEntity<?> login(){
        return null;
    }

    @PostMapping("/users/signup")
    public ResponseEntity<?> signup(){
        return null;
    }

    @PutMapping("/users/{id}/edit-profile")
    public ResponseEntity<?> editProfile(@PathVariable String id, @RequestBody UserInputModel input){
        return null;
    }
}
