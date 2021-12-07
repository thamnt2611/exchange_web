package com.example.exchange.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class VoteId implements Serializable {
    private String userId;
    private String questionId;
}
