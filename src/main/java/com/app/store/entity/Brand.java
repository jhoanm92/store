package com.app.store.entity;

import com.app.store.entity.AuditVariables.AuditVariables;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "brands")
public class Brand extends AuditVariables {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brand_id")
    private Integer id;

    @Column(name = "brand")
    private String brand;
}
