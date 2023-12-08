package com.app.store.entity;

import com.app.store.entity.AuditVariables.AuditVariables;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "currency")
public class Currency extends AuditVariables {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "currency_id")
    private Integer id;

    @Column(name = "currency")
    private String currency;
}
