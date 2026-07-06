package com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.service;

import com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.model.Videojuego;

import java.util.List;

public interface IVideojuegoService {
    public void create(Videojuego videojuego);
    public List<Videojuego> findAll();
}
