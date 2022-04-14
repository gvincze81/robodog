package com.gvincze81.robodog;

import com.gvincze81.robodog.model.Dog;
import com.gvincze81.robodog.service.DogCreator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RobodogApplication {

	public static void main(String[] args) {
		SpringApplication.run(RobodogApplication.class, args);

		Dog dog = DogCreator.createRandomDog();
		System.out.println(dog.getName());
		System.out.println(dog.getAge());
		System.out.println(dog.getBreed().getRace());
	}

}
