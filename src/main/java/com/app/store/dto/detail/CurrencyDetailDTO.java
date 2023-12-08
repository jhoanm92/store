package com.app.store.dto.detail;

import com.app.store.dto.audit.AuditVariablesDTO;
import lombok.Data;

@Data
public class CurrencyDetailDTO extends AuditVariablesDTO {

    private Integer id;

    private String currency;
}
