package com.learn.spring_security_durga.springsecuritylearn.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    @GetMapping("/contacts")
    public String getBalancedDetails(){
        return "Here are the Contacts details from DB";
    }
}
