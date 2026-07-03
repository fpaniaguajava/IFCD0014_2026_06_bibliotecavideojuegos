package com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "t_videojuego")
public class Videojuego {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private Integer calificacion;
    private Boolean favorito;
    private String urlImagen;

    @ManyToOne(fetch = FetchType.LAZY) //Estrategia perezosa (bajo demanda)
    @JoinColumn(name="id_plataforma")
    private Plataforma plataforma;

    @ManyToOne(fetch = FetchType.EAGER) //Estrategia 'ansiosa' (carga toda la relación)
    @JoinColumn(name="id_genero")
    private Genero genero;
}
