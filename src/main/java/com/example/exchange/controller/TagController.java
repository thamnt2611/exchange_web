package com.example.exchange.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class TagController {
    @GetMapping("/tags")
    public ResponseEntity<?> getAllTags(Pageable page){
        return null;
    }
}
