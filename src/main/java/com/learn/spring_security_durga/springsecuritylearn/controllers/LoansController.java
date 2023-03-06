package com.learn.spring_security_durga.springsecuritylearn.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {
    @GetMapping("/myLoans")
    public String getLoansDetails(){
        return "Here are the Loans details from DB";
    }
}
