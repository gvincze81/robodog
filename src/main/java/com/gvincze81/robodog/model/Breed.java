package com.gvincze81.robodog.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Breed {
    private String race;

    public Breed() {}

    public Breed(String race)
    {
        this.race = race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getRace() {
        return race;
    }
}
