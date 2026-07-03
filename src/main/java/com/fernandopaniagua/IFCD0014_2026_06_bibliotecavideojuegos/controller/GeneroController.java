package com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.controller;

import com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.model.Genero;
import com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.repository.IGeneroRepo;
import com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.service.IGeneroService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/genero")
public class GeneroController {
    private IGeneroService generoService;

    public GeneroController(IGeneroService generoService) {
        this.generoService = generoService;
    }

    @GetMapping("/nuevo")
    public String crearGenero(Model model) {
        return "crear-genero";
    }

    @PostMapping("/guardar")
    public String guardarGenero(@ModelAttribute Genero genero, Model model){
        this.generoService.create(genero);
        List<Genero> generos = this.generoService.findAll();
        model.addAttribute("generos", generos);
        return "listado-generos";
    }

    @GetMapping("/lista")
    public String mostrarGenero(Model model){
        List<Genero> generos = this.generoService.findAll();
        model.addAttribute("generos", generos);
        return "listado-generos";
    }
}
