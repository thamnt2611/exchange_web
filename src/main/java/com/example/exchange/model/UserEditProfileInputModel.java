package com.example.exchange.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserEditProfileInputModel {
    @JsonProperty(value = "Id")
    private Integer userId;

    @JsonProperty(value = "Name")
    private String username;

    @JsonProperty(value = "Description")
    private String description;

    @JsonProperty(value = "Tags")
    private TagModel tags;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TagModel getTags() {
        return tags;
    }

    public void setTags(TagModel tags) {
        this.tags = tags;
    }
}
