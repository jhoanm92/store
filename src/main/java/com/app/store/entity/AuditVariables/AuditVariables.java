package com.app.store.entity.AuditVariables;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
public class AuditVariables {

    @Column(name = "active")
    private boolean active;

    @Column(name = "date_creation", updatable = false)
    private LocalDateTime dateCreation;

    @Column(name = "user_creation", length = 50)
    private String userCreation;

    @Column(name = "date_modification")
    private LocalDateTime dateModification;

    @Column(name = "user_modification", length = 50)
    private String userModification;
}
