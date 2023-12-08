package com.app.store.repository;

import com.app.store.entity.Price;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface PriceRepository extends GenericRepository<Price, Integer>{

    @Query("SELECT p FROM Price p " +
            "INNER JOIN Product pro " +
            "ON p.product.id = pro.id " +
            "INNER JOIN Brand bra " +
            "ON p.brand.id = bra.id " +
            "WHERE pro.code = :product " +
            "AND  bra.id = :brand " +
            "AND :date BETWEEN p.startDate AND p.endDate")
    List<Price> findPrice(@Param("product") Integer product,
                         @Param("brand") Integer brand,
                         @Param("date") LocalDateTime date);
}
