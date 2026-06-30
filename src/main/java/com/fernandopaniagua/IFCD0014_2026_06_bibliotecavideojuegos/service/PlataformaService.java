package com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.service;

import com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.model.Plataforma;
import com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.repository.IPlataformaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlataformaService implements IPlataformaService {
    /*
    //Inyección de dependencia al estilo "retro"
    @Autowired
    private IPlataformaRepo repo;
    */

    private IPlataformaRepo repo;
    public PlataformaService(IPlataformaRepo repo) {
        this.repo = repo;
    }

    @Override
    public void create(Plataforma plataforma) {

    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void update(Plataforma plataforma) {

    }

    @Override
    public List<Plataforma> findAll() {
        return List.of();
    }
}
