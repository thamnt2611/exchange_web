package com.example.exchange.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Vote {

    @EmbeddedId
    private VoteId voteId = new VoteId();

    @ManyToOne
    @MapsId("userId")
    private User user;

    @ManyToOne
    @MapsId("questionId")
    private Question question;

    private int score; // -1 or 1
}
