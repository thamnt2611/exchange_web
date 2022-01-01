package com.example.exchange.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "tag")
public class Tag {
    @Id
    @Column(name = "tag_id")
    private Integer tagId;

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "tags")
    @JsonBackReference
    private List<Question> questions = new ArrayList<>();

    private String description;

    @ManyToMany(mappedBy = "tags")
    @JsonBackReference
    private List<User> users = new ArrayList<>();


    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
