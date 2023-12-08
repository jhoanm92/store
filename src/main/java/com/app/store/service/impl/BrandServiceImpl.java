package com.app.store.service.impl;

import com.app.store.dto.detail.BrandDetailDTO;
import com.app.store.entity.Brand;
import com.app.store.service.BrandService;
import com.app.store.repository.BrandRepository;
import com.app.store.repository.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Class BrandServiceImpl
 * Implements interface that contains operations crud
 */
@Service
public class BrandServiceImpl extends CRUDimpl<Brand, BrandDetailDTO, Integer> implements BrandService {

    @Autowired
    private BrandRepository repository;

    @Override
    protected GenericRepository<Brand, Integer> getRepository() {
        return repository;
    }
}
