package com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos;

import com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.model.Plataforma;
import com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.service.IPlataformaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PlataformaTest {

    @Autowired
    private IPlataformaService plataformaService;

    @Test
    public void create() {
        this.plataformaService.create(
                new Plataforma("Sony",
                        "PlayStation",
                        1994));
    }
}

