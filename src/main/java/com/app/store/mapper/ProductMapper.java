package com.app.store.mapper;

import com.app.store.dto.ProductDTO;
import com.app.store.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper extends GenericMapper<Product, ProductDTO> {
}
