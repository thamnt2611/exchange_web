package com.example.exchange.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class VoteAnswer {

    @EmbeddedId
    private VoteAnswerId voteId = new VoteAnswerId();

    @ManyToOne
    @MapsId("userId")
    private User user;

    @ManyToOne
    @MapsId("answerId")
    @JsonBackReference
    private Answer answer;

    private Integer score; // -1 or 1

    public VoteAnswer(User user, Answer answer, Integer score){
        this.voteId = new VoteAnswerId(user.getUserId(), answer.getAnswerId());
        this.user = user;
        this.answer = answer;
        this.score = score;
    }

    public VoteAnswer(){

    }

    public VoteAnswerId getVoteId() {
        return voteId;
    }

    public void setVoteId(VoteAnswerId voteId) {
        this.voteId = voteId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}