package com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.service;

import com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.model.Genero;
import com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.repository.IGeneroRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroServiceImpl implements IGeneroService{
    private IGeneroRepo generoRepo;
    public GeneroServiceImpl(IGeneroRepo generoRepo) {
        this.generoRepo = generoRepo;
    }

    @Override
    public void create(Genero genero) {
        this.generoRepo.save(genero);
    }

    @Override
    public List<Genero> findAll() {
        return this.generoRepo.findAll();
    }
}
