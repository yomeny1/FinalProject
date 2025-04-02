package com.example.FinalProject.DataBase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import com.example.FinalProject.models.Animals;

@Service
public class AnimalService {
    private final AnimalRepository animalRepository;

    @Autowired
    public AnimalService (AnimalRepository animalRepository){
        this.animalRepository = animalRepository;
    }

    public List<Animals> getAllAnimals() {
        return animalRepository.findAll();
    }

    public String getAnimalById(BigInteger animalId) {
        Animals animal = animalRepository.findByanimalId(animalId);
        return (animal != null) ? animal.getDescription() : "Animal not found";
    }
}
