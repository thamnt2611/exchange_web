package com.example.exchange.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Id;

public class TagModel {
    @JsonProperty(value = "id")
    private String tagId;

    @JsonProperty(value = "name")
    private String name;

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
