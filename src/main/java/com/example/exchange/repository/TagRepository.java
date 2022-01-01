package com.example.exchange.repository;

import com.example.exchange.entity.Question;
import com.example.exchange.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TagRepository extends JpaRepository<Tag, Integer> {
    List<Tag> findAll();
    Tag findByName(String name);
    Tag findByTagId(String id);
}
