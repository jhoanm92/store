package com.app.store.dto.detail;

import com.app.store.dto.audit.AuditVariablesDTO;
import lombok.Data;

@Data
public class BrandDetailDTO extends AuditVariablesDTO {

    private Integer id;
    private String brand;
}
