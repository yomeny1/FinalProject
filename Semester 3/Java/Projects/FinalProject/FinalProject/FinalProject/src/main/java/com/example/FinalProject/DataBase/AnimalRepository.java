package com.example.FinalProject.DataBase;

import com.example.FinalProject.models.Animals;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.math.BigInteger;

public interface AnimalRepository extends MongoRepository<Animals, String> {
    Animals findByanimalId(BigInteger animalId);
}
