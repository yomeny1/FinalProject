package com.example.FinalProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // create a mapping for "/"

    @GetMapping("/")
    public String openHome(Model theModel) {

        return "indexTwo";
    }

    @GetMapping("/showAnimals")
    public String showAnimals(Model theModel){

        return "animals";
    }


}
