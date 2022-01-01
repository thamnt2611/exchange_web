package com.example.exchange.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LikeQuestionInputModel {
    @JsonProperty(value = "UserId")
    private Integer userId;

    @JsonProperty(value = "QuestionId")
    private Integer questionId;

    @JsonProperty(value = "Status")
    private Integer status;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
