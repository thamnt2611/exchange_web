package com.example.exchange.service;

import com.example.exchange.entity.Question;
import com.example.exchange.model.QuestionInputModel;

import java.util.List;

public interface QuestionService {
    public List<Question> findAllQuestions();

    public Question save(QuestionInputModel input);

    public Question update(Integer questionId, QuestionInputModel input);

    public Question findQuestionById(Integer questionId);

    public Question findQuestionByKeyWord(String keyWord);
}
