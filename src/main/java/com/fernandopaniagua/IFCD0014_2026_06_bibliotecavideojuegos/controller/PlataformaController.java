package com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlataformaController {
   @GetMapping("/plataforma/nueva")
   public String crearPlataforma(Model model){
       return "crear-plataforma";
   }

   @GetMapping("/plataforma/lista")
   public String mostrarPlataformas(Model model){
       return "listado-plataformas";
   }
}
