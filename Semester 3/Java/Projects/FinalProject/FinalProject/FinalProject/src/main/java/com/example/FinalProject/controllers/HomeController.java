package com.example.FinalProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigInteger;

@Controller
public class HomeController {

    // create a mapping for "/"

    @GetMapping("/")
    public String openHome(Model theModel) {

        return "indexTwo";
    }

    @RequestMapping(value = "/animals")
    public String animalRedirect()
    {
        return "redirect:/showAnimals.do";
    }

    @GetMapping("/login")
    public String login(Model theModel){


        return "login";
    }

    @GetMapping("/booking")
    public String booking(Model theModel){

        return "booking";
    }


}
