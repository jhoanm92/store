package com.app.store.mapper.detail;

import com.app.store.dto.detail.PriceDetailDTO;
import com.app.store.entity.Price;
import com.app.store.mapper.GenericMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ProductDetailMapper.class, BrandDetailMapper.class})
public interface PriceDetailMapper extends GenericMapper<Price, PriceDetailDTO> {
}
