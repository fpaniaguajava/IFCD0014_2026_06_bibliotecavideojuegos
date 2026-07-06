package com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.service;

import com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.model.Videojuego;
import com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.repository.IVideojuegoRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideojuegoServiceImpl implements IVideojuegoService {
    private IVideojuegoRepo videojuegoRepo;

    public VideojuegoServiceImpl(IVideojuegoRepo videojuegoRepo) {
        this.videojuegoRepo = videojuegoRepo;
    }

    @Override
    public void create(Videojuego videojuego) {
        this.videojuegoRepo.save(videojuego);
    }

    @Override
    public List<Videojuego> findAll() {
        return this.videojuegoRepo.findAll();
    }
}
