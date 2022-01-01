package com.example.exchange.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class VoteQuestionId implements Serializable {
    private Integer userId;
    private Integer questionId;

    public VoteQuestionId(Integer userId, Integer questionId) {
        this.userId = userId;
        this.questionId = questionId;
    }

    public VoteQuestionId(){

    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }
}
