package com.willmd.restapiexample.restapiexample.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/welcome")
public class WelcomeController {

    @GetMapping
    public String welcome() {
        return "Welcome to the REST API example!";
    }
}
