package com.example.exchange.model;

import com.example.exchange.entity.Tag;
import com.example.exchange.entity.User;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import java.util.List;

public class UserOutputModel {
    @JsonProperty(value = "userId")
    private Integer userId;

    @JsonProperty(value = "username")
    private String userName;

    @JsonProperty(value = "password")
    private String password;

    @JsonProperty(value = "description")
    private String description;

    @JsonProperty(value = "favourite")
    private String favourite;

    @JsonProperty(value = "star")
    private int star;

    @JsonProperty(value = "tags")
    private List<Tag> tags;

    public UserOutputModel(User user) {
        this.userId = user.getUserId();
        this.userName = user.getUserName();
        this.password = user.getPassword();
        this.description = user.getDescription();
        this.favourite = user.getFavourite();
        this.star = user.getStar();
        this.tags = user.getTags();
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

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }
}
