package com.gvincze81.robodog.service;

import com.gvincze81.robodog.model.Breed;
import com.gvincze81.robodog.model.Dog;

import java.util.ArrayList;
import java.util.List;

public class DogStorage {
    private final List<Dog> dogs = new ArrayList<>();

    public void addDog(Dog dog){
        dogs.add(dog);
    }

    public void updateDog(String name, int age, Breed breed)
    {
        for (Dog dog : dogs) {
            if (dog.getName().equals(name)) {
                dog.setAge(age);
                dog.setBreed(breed);
                break;
            }
        }
    }

    public List<Dog> getDogs() {
        return dogs;
    }
}
