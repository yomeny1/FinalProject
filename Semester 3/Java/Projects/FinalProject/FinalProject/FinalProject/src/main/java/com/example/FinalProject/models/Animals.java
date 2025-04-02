package com.example.FinalProject.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;

@Document(collection = "animals")
public class Animals {
    @Id
    public BigInteger animalId;

    public String Name;

    public String description;

    public String Breed;

    public int Age;

    public String Gender;

    public Animals() {}

    public Animals(String Name, String Description, String Breed, int Age, String Gender) {
        this.Name = Name;
        this.description = Description;
        this.Breed = Breed;
        this.Age = Age;
        this.Gender = Gender;
    }


    public BigInteger getAnimalId() {
        return animalId;
    }

    public void setAnimalId(BigInteger AnimalId) {
        this.animalId = AnimalId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String Description) {
        this.description = Description;
    }

    public String getBreed() {
        return Breed;
    }

    public void setBreed(String Breed) {
        this.Breed = Breed;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
}
