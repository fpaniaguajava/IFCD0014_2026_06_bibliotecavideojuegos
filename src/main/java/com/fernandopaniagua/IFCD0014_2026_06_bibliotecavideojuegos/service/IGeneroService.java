package com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.service;

import com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.model.Genero;

import java.util.List;

public interface IGeneroService {
    public void create(Genero genero);
    public List<Genero> findAll();
}
