package com.example.exchange.repository;

import com.example.exchange.entity.Question;
import com.example.exchange.entity.Tag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface QuestionRepository extends CrudRepository<Question, String> {
    List<Question> findByTagIn(List<Tag> tags);
    List<Question> findByUserId(String userId);
}
