package com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String alexander() {
        return "Hello, World!";
    }
}
