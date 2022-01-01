package com.example.exchange.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class VoteAnswerId implements Serializable {
    private Integer userId;
    private Integer answerId;

    public VoteAnswerId(Integer userId, Integer answerId){
        this.answerId = answerId;
        this.userId = userId;
    }

    public VoteAnswerId(){

    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }
}