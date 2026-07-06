package com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.controller;

import com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.model.Genero;
import com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.model.Videojuego;
import com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.service.IGeneroService;
import com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.service.IPlataformaService;
import com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.service.IVideojuegoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/videojuego")
public class VideojuegoController {
    private IPlataformaService plataformaService;
    private IGeneroService generoService;
    private IVideojuegoService videojuegoService;

    public VideojuegoController(
            IPlataformaService plataformaService,
            IGeneroService generoService,
            IVideojuegoService videojuegoService){
        this.plataformaService = plataformaService;
        this.generoService = generoService;
        this.videojuegoService = videojuegoService;
    }


    @GetMapping("/nuevo")
    public String crearVideojuego(Model model) {
        model.addAttribute("plataformas", plataformaService.findAll());
        model.addAttribute("generos", generoService.findAll());
        return "crear-videojuego";
    }

    @PostMapping("/guardar")
    public String guardarVideojuego(@ModelAttribute Videojuego videojuego, Model model) {
        this.videojuegoService.create(videojuego);

        return "crear-videojuego";
    }
}
