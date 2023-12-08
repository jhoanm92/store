package com.app.store.dto.detail;

import com.app.store.dto.audit.AuditVariablesDTO;
import lombok.Data;

@Data
public class PriceDetailDTO extends AuditVariablesDTO {
    private Integer id;
    private BrandDetailDTO brand;
    private ProductDetailDTO product;
    private CurrencyDetailDTO currency;
    private Integer priceList;
    private Integer priority;
    private Double price;
}
