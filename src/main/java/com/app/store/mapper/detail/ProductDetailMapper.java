package com.app.store.mapper.detail;

import com.app.store.dto.detail.ProductDetailDTO;
import com.app.store.entity.Product;
import com.app.store.mapper.GenericMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductDetailMapper extends GenericMapper<Product, ProductDetailDTO> {
}
