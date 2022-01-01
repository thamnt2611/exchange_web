package com.example.exchange.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class VoteQuestion {

    @EmbeddedId
    private VoteQuestionId voteId;

    @ManyToOne
    @MapsId("userId")
    private User user;

    @ManyToOne
    @MapsId("questionId")
    @JsonBackReference
    private Question question;

    private Integer score; // -1 or 1

    public VoteQuestion(User user, Question question, Integer score){
        this.voteId = new VoteQuestionId(user.getUserId(), question.getQuestionId());
        this.user = user;
        this.question = question;
        this.score = score;
    }

    public VoteQuestion(){

    }

    public VoteQuestionId getVoteId() {
        return voteId;
    }

    public void setVoteId(VoteQuestionId voteId) {
        this.voteId = voteId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
