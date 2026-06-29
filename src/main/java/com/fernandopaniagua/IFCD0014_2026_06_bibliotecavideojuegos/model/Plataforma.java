package com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Plataforma {
    @Id
    private long id;
    private String fabricante;
    private String nombre;
    private int anyo;

    public Plataforma() {
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
