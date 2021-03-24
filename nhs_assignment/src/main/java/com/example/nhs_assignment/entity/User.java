package com.example.nhs_assignment.entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    private @Id
    @GeneratedValue
    Long id;

    @ElementCollection
    private List<Skill> skills = new ArrayList<>();


    public User(List<Skill> skill) {
        this.skills = skill;
    }

    public User() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
