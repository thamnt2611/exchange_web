package com.example.exchange.repository;

import com.example.exchange.entity.Answer;
import java.util.List;

public interface AnswerRepository {
    List<Answer> findByQuestionId(String questionId);
    List<Answer> findByUserId(String userId);
    Answer findById(String answerId);
}
