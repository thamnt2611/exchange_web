package com.example.exchange.model;

import com.example.exchange.entity.Tag;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class QuestionInputModel {
    @JsonProperty(value = "Title")
    private String title;

    @JsonProperty(value = "Content")
    private String content;

    @JsonProperty(value = "Tags")
    private List<TagModel> tags;

    @JsonProperty(value = "UserId")
    private int userId;

    public QuestionInputModel(String title, String content, List<TagModel> tags, int userId) {
        this.title = title;
        this.content = content;
        this.tags = tags;
        this.userId = userId;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public void setTags(List<TagModel> tags) {
        this.tags = tags;
    }
}
