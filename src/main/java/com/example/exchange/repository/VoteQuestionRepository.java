package com.example.exchange.repository;

import com.example.exchange.entity.VoteQuestion;
import com.example.exchange.entity.VoteQuestionId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface VoteQuestionRepository extends JpaRepository<VoteQuestion, VoteQuestionId> {
    List<VoteQuestion> findByVoteId_UserId(String userId);
    VoteQuestion findByVoteId(VoteQuestionId voidId);
}
