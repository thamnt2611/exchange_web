package com.example.exchange.repository;

import com.example.exchange.entity.VoteAnswer;
import com.example.exchange.entity.VoteAnswerId;
import com.example.exchange.entity.VoteQuestion;
import com.example.exchange.entity.VoteQuestionId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface VoteAnswerRepository extends JpaRepository<VoteAnswer, VoteAnswerId> {
    List<VoteAnswer> findByVoteId_UserId(String userId);
    VoteAnswer findByVoteId(VoteAnswer voidId);
}
