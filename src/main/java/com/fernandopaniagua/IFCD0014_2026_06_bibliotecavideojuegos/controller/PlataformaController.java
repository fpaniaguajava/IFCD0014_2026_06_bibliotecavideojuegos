package com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.controller;

import com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.model.Plataforma;
import com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.service.IPlataformaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlataformaController {
    private IPlataformaService plataformaService;

    public PlataformaController(IPlataformaService plataformaService){
        this.plataformaService = plataformaService;
    }

    @GetMapping("/plataforma/nueva")
    public String crearPlataforma(Model model) {
        return "crear-plataforma";
    }

    @GetMapping("/plataforma/lista")
    public String mostrarPlataformas(Model model) {
        return "listado-plataformas";
    }

    @PostMapping("/plataformas/guardar")
    public String guardarPlataforma(
            @RequestParam String fabricante,
            @RequestParam String nombre,
            @RequestParam int anyo,
            Model model) {
        Plataforma plataforma = new Plataforma(fabricante, nombre, anyo);
        this.plataformaService.create(plataforma);
        return "index";
    }
}
