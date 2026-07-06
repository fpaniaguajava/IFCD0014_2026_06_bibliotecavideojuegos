package com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.service;

import com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.model.Genero;
import com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.repository.IGeneroRepo;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroServiceImpl implements IGeneroService{
    private IGeneroRepo generoRepo;
    public GeneroServiceImpl(IGeneroRepo generoRepo) {
        System.out.println("Estoy en el constructor...");
        this.generoRepo = generoRepo;
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Estoy en el postConstruct...");
    }

    @Override
    public void create(Genero genero) {
        this.generoRepo.save(genero);
    }

    @Override
    public List<Genero> findAll() {
        return this.generoRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        this.generoRepo.deleteById(id);
    }
}
