package com.example.exchange.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.sql.Blob;
import java.util.List;

@Entity(name = "user")
public class User {

    @Id
    @Column(name = "user_id")
    private String userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "star")
    private int star;

    @Column(name = "description")
    private String description;

    @Column(name = "favourite")
    private String favourite;

    @Column(name = "avatar")
    private Blob avatar;

    @OneToMany(mappedBy = "user")
    private List<Question> questions;

    public User(){
        super();
    }
}
