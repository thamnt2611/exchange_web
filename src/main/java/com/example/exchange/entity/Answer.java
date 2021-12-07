package com.example.exchange.entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "answer")
public class Answer {

    @Id
    @Column(name = "answer_id")
    private String id;

    @Column(name = "content")
    private String content;

    @Column(name = "score")
    private int score;

    @Column(name = "created_time")
    private Date createdTime;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;
}
