package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class MyController {

    @GetMapping("/test")
    public String testEndPoint() {
        return "Spring boot actuator example";
    }
}
