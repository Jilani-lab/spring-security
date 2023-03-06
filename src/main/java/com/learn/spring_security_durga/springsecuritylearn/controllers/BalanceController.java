package com.learn.spring_security_durga.springsecuritylearn.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController{

    @GetMapping("/myBalance")
    public String getBalancedDetails(){
        return "Here are the Balance details from DB";
    }
}
