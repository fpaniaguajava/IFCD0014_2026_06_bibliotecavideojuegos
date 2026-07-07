package com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.component;

import com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.event.EventoLog;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class IFCD0014LoggerImpl implements ILogger {
    public void writeLog(String message) {
        System.out.println("IFCD0014Logger.writeLog:" + message);
    }

    @EventListener
    public void manejarEvento(EventoLog eventoLog) {
        System.out.println("Evento recibido: " + eventoLog.getMensaje());
    }
}