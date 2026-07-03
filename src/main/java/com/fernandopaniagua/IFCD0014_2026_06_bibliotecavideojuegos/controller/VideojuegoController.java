package com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.controller;

import com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.service.IGeneroService;
import com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.service.IPlataformaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/videojuego")
public class VideojuegoController {
    private IPlataformaService plataformaService;
    private IGeneroService generoService;

    public VideojuegoController(IPlataformaService plataformaService, IGeneroService generoService){
        this.plataformaService = plataformaService;
        this.generoService = generoService;
    }


    @GetMapping("/nuevo")
    public String crearVideojuego(Model model) {
        model.addAttribute("plataformas", plataformaService.findAll());
        model.addAttribute("generos", generoService.findAll());
        return "crear-videojuego";
    }
}
