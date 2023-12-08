package com.app.store.entity;

import com.app.store.entity.AuditVariables.AuditVariables;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "prices")
public class Price extends AuditVariables {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "price_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_brand_fk", referencedColumnName = "brand_id")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "id_product_fk", referencedColumnName = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "id_currency_fk", referencedColumnName = "currency_id")
    private Currency currency;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "end_date")
    private LocalDateTime endDate;

    @Column(name = "price_list")
    private Integer priceList;

    @Column(name = "priority")
    private Integer priority;

    @Column(name = "price")
    private Double price;
}
