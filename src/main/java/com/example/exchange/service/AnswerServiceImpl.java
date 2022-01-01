package com.example.exchange.service;

import com.example.exchange.entity.Answer;
import com.example.exchange.entity.Question;
import com.example.exchange.entity.User;
import com.example.exchange.model.AnswerInputModel;
import com.example.exchange.repository.AnswerRepository;
import com.example.exchange.repository.QuestionRepository;
import com.example.exchange.repository.TagRepository;
import com.example.exchange.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AnswerServiceImpl implements AnswerService{
    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private AnswerRepository answerRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public Answer save(AnswerInputModel input) {
        Answer answer = new Answer();
        answer.setScore(0);
        answer.setCreatedTime(new Date());
        answer.setContent(input.getContent());
        User user = userRepository.findByUserId(input.getUserId());
        Question question = questionRepository.findByQuestionId(input.getQuestionId());
        answer.setUser(user);
        answer.setQuestion(question);

        answerRepository.save(answer);
        return answer;
    }

    @Override
    public Answer update(AnswerInputModel input) {
        Answer answer = answerRepository.findByAnswerId(input.getAnswerId());
        answer.setContent(input.getContent());
        return null;
    }
}
