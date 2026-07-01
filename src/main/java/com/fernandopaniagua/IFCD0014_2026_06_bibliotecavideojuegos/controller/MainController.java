package com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String getMainPage(Model model){
        return "index";
    }
}
