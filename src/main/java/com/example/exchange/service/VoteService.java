package com.example.exchange.service;

import com.example.exchange.entity.VoteAnswer;
import com.example.exchange.entity.VoteQuestion;
import com.example.exchange.model.LikeAnswerInputModel;
import com.example.exchange.model.LikeQuestionInputModel;

public interface VoteService {
    public VoteQuestion saveVoteQuestion(LikeQuestionInputModel input);
    public VoteAnswer saveVoteAnswer(LikeAnswerInputModel input);
}
