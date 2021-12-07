package com.example.exchange.entity;

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
    private String tagId;

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "tags")
    private List<Question> questions = new ArrayList<>();

    private String description;
}
