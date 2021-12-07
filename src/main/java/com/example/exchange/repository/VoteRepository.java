package com.example.exchange.repository;

import com.example.exchange.entity.Vote;
import com.example.exchange.entity.VoteId;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface VoteRepository extends Repository<Vote, VoteId> {
    List<Vote> findByVoteId_UserId(String userId);
    List<Vote> findByVoteIdUserIdAndVoteIdQuestionId(String userId, String questionId);
}
