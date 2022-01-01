package com.example.exchange.service;

import com.example.exchange.entity.Answer;
import com.example.exchange.entity.Question;
import com.example.exchange.model.AnswerInputModel;
import com.example.exchange.model.QuestionInputModel;

public interface AnswerService {
    public Answer save(AnswerInputModel input);

    public Answer update(AnswerInputModel input);
}
