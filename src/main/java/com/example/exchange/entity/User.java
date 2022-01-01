package com.example.exchange.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "user")
public class User {
    @TableGenerator(name = "user_gen", initialValue = 1000000)
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "user_gen")
    private Integer userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "star")
    private Integer star;

    @Column(name = "description")
    private String description;

    @Column(name = "favourite")
    private String favourite;

    @Column(name = "avatar")
    private Blob avatar;

    @Transient
    private String passwordConfirm;

    @OneToMany(mappedBy = "user")
    @JsonBackReference
    private List<Question> questions;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "user_tag",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    @JsonManagedReference
    private List<Tag> tags = new ArrayList<>();

    public User(){
        super();
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFavourite() {
        return favourite;
    }

    public void setFavourite(String favourite) {
        this.favourite = favourite;
    }

    public String getAvatar() {
        return "Avatar";
    }

    public void setAvatar(Blob avatar) {
        this.avatar = avatar;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }
}
