package com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "t_genero")
public class Genero {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;
    String nombre;
    String descripcion;
}
