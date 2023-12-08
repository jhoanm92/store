package com.app.store.mapper;

import com.app.store.dto.BrandDTO;
import com.app.store.entity.Brand;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface BrandMapper extends GenericMapper<Brand, BrandDTO> {
}
