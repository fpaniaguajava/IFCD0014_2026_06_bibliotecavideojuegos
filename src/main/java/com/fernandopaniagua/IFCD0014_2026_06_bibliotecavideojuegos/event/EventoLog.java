package com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.event;

public class EventoLog {
    private String mensaje;
    public EventoLog(String mensaje) {
        this.mensaje = mensaje;
    }
    public String getMensaje() {
        return this.mensaje;
    }
}
