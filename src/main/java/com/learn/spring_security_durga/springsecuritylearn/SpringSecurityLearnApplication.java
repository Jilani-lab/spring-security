package com.learn.spring_security_durga.springsecuritylearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.learn.spring_security_durga.springsecuritylearn.controllers")

public class SpringSecurityLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityLearnApplication.class, args);
	}

}
