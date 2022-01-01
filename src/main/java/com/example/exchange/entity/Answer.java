package com.example.exchange.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity(name = "answer")
public class Answer {
    @TableGenerator(name = "answer_gen", initialValue = 1000000)
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "answer_gen")
    private Integer answerId;

    @Column(name = "content")
    private String content;

    @Column(name = "score")
    private Integer score;

    @Column(name = "created_time")
    private Date createdTime;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonManagedReference
    private User user;

    @ManyToOne
    @JoinColumn(name = "question_id")
    @JsonBackReference
    private Question question;

    @OneToMany(mappedBy = "answer")
    private List<VoteAnswer> votes = new ArrayList<>();

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

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
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
}

