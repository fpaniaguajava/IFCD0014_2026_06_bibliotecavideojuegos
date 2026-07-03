package com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/genero")
public class GeneroController {
    @GetMapping("/nuevo")
    public String crearGenero(Model model) {
        return "crear-genero";
    }
}
