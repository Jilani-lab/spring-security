package com.learn.spring_security_durga.springsecuritylearn.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {

    @GetMapping("/notices")
    public String getNoticesDetails(){
        return "Here are the Notices details from DB";
    }
}
