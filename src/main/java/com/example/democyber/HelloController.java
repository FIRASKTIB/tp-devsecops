package com.example.democyber;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // LIGNE DU FAUX SECRET (à ajouter ici) :
    private static final String GITHUB_TOKEN = "ghp_1234567890abcdef1234567890abcdef1234";

    @GetMapping("/")
    public String sayHello() {
        return "Bonjour depuis democyber Spring Boot !";
    }
}