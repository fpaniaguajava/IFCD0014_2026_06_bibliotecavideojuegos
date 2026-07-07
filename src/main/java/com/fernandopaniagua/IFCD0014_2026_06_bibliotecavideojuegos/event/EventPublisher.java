package com.fernandopaniagua.IFCD0014_2026_06_bibliotecavideojuegos.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class EventPublisher {
    private final ApplicationEventPublisher publisher;
    public EventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }
    public void publicarEvento(String mensaje) {
        EventoLog eventoLog = new EventoLog(mensaje);
        publisher.publishEvent(eventoLog);
    }
}
