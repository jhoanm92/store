package com.app.store.entity;

import com.app.store.entity.AuditVariables.AuditVariables;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "products")
public class Product extends AuditVariables {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer id;

    @Column(name = "code")
    private Integer code;

    @Column(name = "product")
    private String product;
}
