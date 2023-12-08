package com.app.store.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PriceDTO {

    private ProductDTO product;
    private BrandDTO brand;
    private Integer priceList;
    private Integer priority;
    @JsonFormat(pattern = "yyyy-MM-dd-HH:mm:ss")
    private LocalDateTime startDate;
    @JsonFormat(pattern = "yyyy-MM-dd-HH:mm:ss")
    private LocalDateTime endDate;
    private Double price;
}
