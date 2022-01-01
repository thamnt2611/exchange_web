package com.example.exchange.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LikeAnswerInputModel {
    @JsonProperty(value = "UserId")
    private Integer userId;

    @JsonProperty(value = "AnswerId")
    private Integer answerId;

    @JsonProperty(value = "Status")
    private Integer status;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
