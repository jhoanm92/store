package com.app.store.mapper.detail;

import com.app.store.dto.detail.BrandDetailDTO;
import com.app.store.entity.Brand;
import com.app.store.mapper.GenericMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BrandDetailMapper extends GenericMapper<Brand, BrandDetailDTO> {
}
