package com.app.store.service.impl;

import com.app.store.dto.detail.CurrencyDetailDTO;
import com.app.store.entity.Currency;
import com.app.store.service.CurrencyService;
import com.app.store.repository.CurrencyRepository;
import com.app.store.repository.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Class CurrencyServiceImpl
 * Implements interface that contains operations crud
 */
@Service
public class CurrencyServiceImpl extends CRUDimpl<Currency, CurrencyDetailDTO, Integer> implements CurrencyService {

    @Autowired
    private CurrencyRepository repository;

    @Override
    protected GenericRepository<Currency, Integer> getRepository() {
        return repository;
    }
}
