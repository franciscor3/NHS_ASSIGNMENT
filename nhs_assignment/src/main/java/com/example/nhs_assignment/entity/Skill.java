package com.example.nhs_assignment.entity;

import javax.persistence.*;

@Embeddable
public class Skill {

    private String name;
    private Expertise level;




    public Skill(String name, Expertise level) {
        this.name = name;
        this.level = level;
    }

    public Skill() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Expertise getLevel() {
        return level;
    }

    public void setLevel(Expertise level) {
        this.level = level;
    }

}
