package com.learn.spring_security_durga.springsecuritylearn.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController{

    @GetMapping("/myCards")
    public String getCardDetails(){
        return "Here are the Cards details from DB";
    }
}
