package com.app.store.mapper;

import com.app.store.dto.PriceDTO;
import com.app.store.entity.Price;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ProductMapper.class, BrandMapper.class})
public interface PriceMapper extends GenericMapper<Price, PriceDTO> {
}
