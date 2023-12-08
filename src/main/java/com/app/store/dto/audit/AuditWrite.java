package com.app.store.dto.audit;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class AuditWrite<T extends AuditVariablesDTO>{

    public T creation(T t) {
        t.setDateCreation(LocalDateTime.now());
        return t;
    }

    public T modofication(T t) {
        t.setDateModification(LocalDateTime.now());
        return t;
    }
}
