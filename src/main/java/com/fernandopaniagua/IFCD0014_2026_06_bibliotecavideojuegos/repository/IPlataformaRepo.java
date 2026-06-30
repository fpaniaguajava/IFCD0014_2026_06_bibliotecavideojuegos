package com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.repository;

import com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.model.Plataforma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlataformaRepo extends JpaRepository<Plataforma, Long> {
}
