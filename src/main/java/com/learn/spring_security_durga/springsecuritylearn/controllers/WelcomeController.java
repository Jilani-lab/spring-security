package com.learn.spring_security_durga.springsecuritylearn.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    @GetMapping("/")
    public String sayWelcome(){
        return "Welcome to spring Application with Security";
    }

}
