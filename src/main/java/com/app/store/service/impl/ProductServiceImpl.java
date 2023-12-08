package com.app.store.service.impl;

import com.app.store.dto.detail.ProductDetailDTO;
import com.app.store.entity.Product;
import com.app.store.service.ProductService;
import com.app.store.repository.GenericRepository;
import com.app.store.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Class ProductServiceImpl
 * Implements interface that contains operations crud
 */
@Service
public class ProductServiceImpl extends CRUDimpl<Product, ProductDetailDTO, Integer> implements ProductService {

    @Autowired
    private ProductRepository repository;

    @Override
    protected GenericRepository<Product, Integer> getRepository() {
        return repository;
    }
}
