package com.example.exchange.model;

import com.example.exchange.entity.Answer;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class AnswerOutputModel {
    @JsonProperty(value = "id")
    private Integer answerId;

    @JsonProperty(value = "content")
    private String content;

    @JsonProperty(value = "createTime")
    private Date createdTime;

    @JsonProperty(value = "modifyTime")
    private Date modifiedTime;

    @JsonProperty(value = "userId")
    private Integer userId;

    @JsonProperty(value = "name")
    private String userName;

    @JsonProperty(value = "questionId")
    private Integer questionId;

    @JsonProperty(value = "countLike")
    private Integer countLike;

    @JsonProperty(value = "like")
    private Integer like;

    @JsonProperty(value = "countDislike")
    private Integer countDislike;

    @JsonProperty(value = "statusLike")
    private Integer statusLike;

    public AnswerOutputModel(Answer answer){
        this.answerId = answer.getAnswerId();
        this.content = answer.getContent();
        this.createdTime = answer.getCreatedTime();
        this.modifiedTime = answer.getCreatedTime(); // TODO
        this.userId = answer.getUser().getUserId();
        this.userName = answer.getUser().getUserName();
        this.questionId = answer.getQuestion().getQuestionId();
        this.countLike = 0; // TODO
        this.like = answer.getScore(); // TODO
        this.countDislike = 0; // TODO
        this.statusLike = 0; // TODO
    }

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

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getCountLike() {
        return countLike;
    }

    public void setCountLike(Integer countLike) {
        this.countLike = countLike;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public Integer getCountDislike() {
        return countDislike;
    }

    public void setCountDislike(Integer countDislike) {
        this.countDislike = countDislike;
    }

    public Integer getStatusLike() {
        return statusLike;
    }

    public void setStatusLike(Integer statusLike) {
        this.statusLike = statusLike;
    }
}
