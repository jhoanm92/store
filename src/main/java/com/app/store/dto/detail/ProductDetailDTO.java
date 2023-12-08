package com.app.store.dto.detail;

import com.app.store.dto.audit.AuditVariablesDTO;
import lombok.Data;

@Data
public class ProductDetailDTO extends AuditVariablesDTO {

    private Integer id;
    private Integer code;
    private String product;
}
