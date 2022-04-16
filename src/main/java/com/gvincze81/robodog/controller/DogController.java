package com.gvincze81.robodog.controller;

import com.gvincze81.robodog.model.Dog;
import com.gvincze81.robodog.service.DogCreator;
import com.gvincze81.robodog.service.DogStorage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DogController {
    private final DogStorage dogStorage = new DogStorage();

    @GetMapping("/api/dogs")
    public List<Dog> getAllDogs()
    {
        return dogStorage.getDogs();
    }

    @GetMapping("/api/random-dog")
    public Dog getRandomDog()
    {
        return dogStorage.addRandomDog();
    }

    @PostMapping("/api/new-dog")
    public void newDog(@RequestBody Dog dog)
    {
        dogStorage.addDog(dog);
    }

    @PutMapping("/api/update-dog/{name}")
    public Dog updateDog(@PathVariable String name, @RequestBody Dog dog)
    {
        return dogStorage.updateDog(name, dog.getAge(), dog.getBreed());
    }

}
