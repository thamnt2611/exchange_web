package com.example.exchange.service;

import com.example.exchange.entity.*;
import com.example.exchange.model.LikeAnswerInputModel;
import com.example.exchange.model.LikeQuestionInputModel;
import com.example.exchange.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoteServiceImpl implements VoteService{
    @Autowired
    private VoteQuestionRepository voteQuestionRepository;

    @Autowired
    private VoteAnswerRepository voteAnswerRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private AnswerRepository answerRepository;

    @Override
    public VoteQuestion saveVoteQuestion(LikeQuestionInputModel input) {
        User user = userRepository.findByUserId(input.getUserId());
        Question question = questionRepository.findByQuestionId(input.getQuestionId());
        VoteQuestion vote = new VoteQuestion(user, question, input.getStatus());
        voteQuestionRepository.save(vote);
        Integer score = question.getScore() + input.getStatus();
        System.out.println(input.getStatus());
        question.setScore(score);
        questionRepository.save(question);
        System.out.println(question.getScore());
        return vote;
    }

    @Override
    public VoteAnswer saveVoteAnswer(LikeAnswerInputModel input) {
        User user = userRepository.findByUserId(input.getUserId());
        Answer answer = answerRepository.findByAnswerId(input.getAnswerId());
        VoteAnswer vote = new VoteAnswer(user, answer, input.getStatus());
        voteAnswerRepository.save(vote);
        Integer score = answer.getScore() + input.getStatus();
        System.out.println(input.getStatus());
        answer.setScore(score);
        answerRepository.save(answer);
        System.out.println(answer.getScore());
        return vote;
    }
}
