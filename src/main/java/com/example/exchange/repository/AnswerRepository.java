package com.example.exchange.repository;

import com.example.exchange.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
    List<Answer> findByQuestion_QuestionId(Integer questionId);
    List<Answer> findByUser_UserId(Integer userId);
    Answer findByAnswerId(Integer answerId);
}
