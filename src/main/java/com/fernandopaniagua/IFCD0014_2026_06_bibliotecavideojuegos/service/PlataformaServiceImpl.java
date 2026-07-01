package com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.service;

import com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.model.Plataforma;
import com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.repository.IPlataformaRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlataformaServiceImpl implements IPlataformaService{
    //Repositorio (persistencia) de plataformas
    private IPlataformaRepo repo;

    public PlataformaServiceImpl(IPlataformaRepo repo) {
        this.repo = repo;
    }

    @Override
    public void create(Plataforma plataforma) {
        this.repo.save(plataforma);
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
