package com.gvincze81.robodog.controller;

import com.gvincze81.robodog.model.Dog;
import com.gvincze81.robodog.service.DogCreator;
import com.gvincze81.robodog.service.DogStorage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DogController {
    private final DogStorage dogStorage = new DogStorage();

    @GetMapping("/dogs")
    public List<Dog> getAllDogs()
    {
        return dogStorage.getDogs();
    }

    @GetMapping("/random-dog")
    public Dog getRandomDog()
    {
        Dog dog = DogCreator.createRandomDog();
        dogStorage.addDog(dog);
        return dog;
    }

    @PostMapping("/new-dog")
    public void newRandomDog(@RequestBody Dog dog)
    {
        dogStorage.addDog(dog);
    }

    @PutMapping("/update-dog/{name}")
    public void updateDog(@PathVariable String name, @RequestBody Dog dog)
    {
        dogStorage.updateDog(name, dog.getAge(), dog.getBreed());
    }

}
