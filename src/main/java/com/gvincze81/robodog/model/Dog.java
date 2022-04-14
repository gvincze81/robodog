package com.gvincze81.robodog.model;

import lombok.Getter;
import lombok.Setter;

public class Dog {
    @Setter
    @Getter
    private String name;
    @Setter
    @Getter
    private int age;
    @Setter
    @Getter
    private Breed breed;

    public Dog(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
}
