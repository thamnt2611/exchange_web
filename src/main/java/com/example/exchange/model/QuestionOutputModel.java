package com.example.exchange.model;

import com.example.exchange.entity.Answer;
import com.example.exchange.entity.Question;
import com.example.exchange.entity.Tag;
import com.example.exchange.entity.VoteQuestion;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuestionOutputModel {
    @JsonProperty(value = "id")
    private Integer questionId;

    @JsonProperty(value = "title")
    private String title;

    @JsonProperty(value = "content")
    private String content;

    @JsonProperty(value = "createTime")
    private Date createdTime;

    @JsonProperty(value = "modifyTime")
    private Date modifiedTime = new Date();

    @JsonProperty(value = "view")
    private Integer view = 0;

    @JsonProperty(value = "tags")
    private List<Tag> tags;

    @JsonProperty(value = "countAnswer")
    private Integer countAnswer;

    @JsonProperty(value = "userId")
    private Integer userId;

    @JsonProperty(value = "name")
    private String userName;

    @JsonProperty(value = "countVote")
    private Integer score;

    @JsonProperty(value = "countLike")
    private Integer countLike = 0;

    @JsonProperty(value = "countDislike")
    private Integer countDislike = 0;

    @JsonProperty(value = "answers")
    private List<AnswerOutputModel> answers;

    @JsonProperty(value = "statusLike")
    private Integer statusLike = 0;

    @JsonProperty(value = "viewerVote")
    private Integer viewerVote = 0; // -1: dislike, 0: not yet, 1: like

    public QuestionOutputModel(Question question){
        this.questionId = question.getQuestionId();
        this.title = question.getTitle();
        this.content = question.getContent();
        this.createdTime = question.getCreatedTime();
        this.view = question.getView();
        this.tags = question.getTags();
        this.countAnswer = question.getAnswers().size();
        this.userId = question.getUser().getUserId();
        this.userName = question.getUser().getUserName();
        this.score = question.getScore();
        List<AnswerOutputModel> outAnswers = new ArrayList<>();
        for(Answer answer : question.getAnswers()){
            outAnswers.add(new AnswerOutputModel(answer));
        }
        this.answers = outAnswers;
    }

    public QuestionOutputModel(Question question, Integer viewerId){
        this(question);
        for(VoteQuestion vote : question.getVotes()){
            if(vote.getUser().getUserId() == viewerId){
                this.viewerVote = vote.getScore();
                break;
            }
        }
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Integer getView() {
        return view;
    }

    public void setView(Integer view) {
        this.view = view;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Integer getCountAnswer() {
        return countAnswer;
    }

    public void setCountAnswer(Integer countAnswer) {
        this.countAnswer = countAnswer;
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

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public List<AnswerOutputModel> getAnswers() {
        return answers;
    }

    public void setAnswers(List<AnswerOutputModel> answers) {
        this.answers = answers;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public Integer getCountLike() {
        return countLike;
    }

    public void setCountLike(Integer countLike) {
        this.countLike = countLike;
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

    public Integer getViewerVote() {
        return viewerVote;
    }

    public void setViewerVote(Integer viewerVote) {
        this.viewerVote = viewerVote;
    }
}
