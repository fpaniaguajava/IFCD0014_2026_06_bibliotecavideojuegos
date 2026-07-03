package com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "t_plataforma")
public class Plataforma {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column(name = "empresa", nullable = false)
    private String fabricante;

    @Column(nullable = false)
    private String nombre;

    private int anyo;

    public Plataforma(){
    }

    public Plataforma(String fabricante, String nombre, int anyo) {
        this.fabricante = fabricante;
        this.nombre = nombre;
        this.anyo = anyo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }
}
