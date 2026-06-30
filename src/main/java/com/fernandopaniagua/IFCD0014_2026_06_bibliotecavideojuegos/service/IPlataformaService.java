package com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.service;

import java.util.List;
import com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.model.Plataforma;

public interface IPlataformaService {
    public void create(Plataforma plataforma);
    public void delete(long id);
    public void update(Plataforma plataforma);
    public List<Plataforma> findAll();
}
