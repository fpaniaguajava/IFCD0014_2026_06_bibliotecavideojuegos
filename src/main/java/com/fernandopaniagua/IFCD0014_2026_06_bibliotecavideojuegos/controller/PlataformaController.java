package com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.controller;

import com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.event.EventPublisher;
import com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.model.Plataforma;
import com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.service.IPlataformaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/plataforma")
public class PlataformaController {
    private IPlataformaService plataformaService;
    private EventPublisher publicadorDeEventos;
    public PlataformaController(IPlataformaService plataformaService,
                                EventPublisher publicadorDeEventos) {
        this.plataformaService = plataformaService;
        this.publicadorDeEventos = publicadorDeEventos;
    }

    @GetMapping("/nueva")
    public String crearPlataforma(Model model) {
        return "crear-plataforma";
    }

    @GetMapping("/lista")
    public String mostrarPlataformas(Model model) {
        this.publicadorDeEventos.publicarEvento("Se han leído todas las plataformas");
        List<Plataforma> plataformas = this.plataformaService.findAll();
        model.addAttribute("plataformas", plataformas);
        return "listado-plataformas";
    }

    @PostMapping("/guardar")
    public String guardarPlataforma(
            @RequestParam String fabricante,
            @RequestParam String nombre,
            @RequestParam int anyo,
            Model model) {
        Plataforma plataforma = new Plataforma(fabricante, nombre, anyo);
        this.plataformaService.create(plataforma);
        model.addAttribute("plataformas", this.plataformaService.findAll());
        return "listado-plataformas";
    }

    @PostMapping("/guardarcompleta")
    public String guardarPlataformaCompleta(
            @ModelAttribute Plataforma plataforma,
            Model model) {
        this.plataformaService.create(plataforma);
        return "crear-plataforma";
    }
}
