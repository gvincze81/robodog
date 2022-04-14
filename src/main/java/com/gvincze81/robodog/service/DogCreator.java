package com.gvincze81.robodog.service;

import com.gvincze81.robodog.model.Breed;
import com.gvincze81.robodog.model.Dog;

import java.util.Random;

public class DogCreator {
    private static final int MAX_AGE = 15;
    private static final String[] names = {"alpha", "beta", "gamma", "delta"};
    private static final String[] races = {"German Shepherd", "Kuvasz", "Doberman", "Rotweiler"};

    private static final Random random = new Random();

    public static Dog createRandomDog()
    {
        String name = getRandomElem(names);
        Breed breed = new Breed(getRandomElem(races));
        int age = random.nextInt(MAX_AGE);
        return new Dog(name, age, breed);
    }

    private static String getRandomElem(String[] arr)
    {
        return arr[random.nextInt(arr.length)];
    }

}
