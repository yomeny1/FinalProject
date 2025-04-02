package com.example.FinalProject.controllers;

import com.example.FinalProject.models.Animals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.FinalProject.DataBase.AnimalService;

import java.math.BigInteger;
import java.util.List;

@Controller
public class AnimalController {
    private final AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping("/showAnimals")
    public String showAnimals(Model model){
        List<Animals> animals = animalService.getAllAnimals();
        model.addAttribute("animals", animals);
        return "animals";
    }

    @GetMapping("/animal/{animalId}")
    public String details(@PathVariable("animalId") BigInteger animalId, Model theModel){

        String description = animalService.getAnimalById(animalId);
        theModel.addAttribute("animalId", animalId);
        theModel.addAttribute("description", description);

        return "animalDetails";
    }
}
