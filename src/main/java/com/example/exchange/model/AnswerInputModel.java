package com.example.exchange.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AnswerInputModel {
    @JsonProperty(value = "Id")
    private Integer answerId;

    @JsonProperty(value = "Content")
    private String content;

    @JsonProperty(value = "UserId")
    private Integer userId;

    @JsonProperty(value = "QuestionId")
    private Integer questionId;


    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
