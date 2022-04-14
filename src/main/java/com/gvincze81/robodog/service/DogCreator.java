package com.gvincze81.robodog.service;

import com.gvincze81.robodog.model.Breed;
import com.gvincze81.robodog.model.Dog;

import java.util.Random;

public class DogCreator {
    private static final int MAX_AGE = 15;
    private static final String[] names = {"alpha", "beta", "gamma", "delta"};
    private static final String[] races = {"German Shepherd", "Kuvasz", "Doberman", "Rotweiler"};

    public static Dog createRandomDog()
    {
        String name = getRandomElem(names);
        Breed breed = new Breed(getRandomElem(races));
        int age = new Random().nextInt(MAX_AGE);
        return new Dog(name, age, breed);
    }

    private static String getRandomElem(String[] arr)
    {
        Random random = new Random();
        return arr[random.nextInt(arr.length)];
    }

}
