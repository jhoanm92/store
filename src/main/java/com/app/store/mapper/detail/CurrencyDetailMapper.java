package com.app.store.mapper.detail;

import com.app.store.dto.detail.CurrencyDetailDTO;
import com.app.store.entity.Currency;
import com.app.store.mapper.GenericMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CurrencyDetailMapper extends GenericMapper<Currency, CurrencyDetailDTO> {
}
