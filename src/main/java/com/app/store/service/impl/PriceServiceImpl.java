package com.app.store.service.impl;

import com.app.store.dto.PriceDTO;
import com.app.store.dto.detail.PriceDetailDTO;
import com.app.store.entity.Price;
import com.app.store.exception.ModeloNotFoundException;
import com.app.store.mapper.PriceMapper;
import com.app.store.service.PriceService;
import com.app.store.repository.GenericRepository;
import com.app.store.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;

/**
 * Class PriceServiceImpl
 * Implements interface that contains operations crud
 */
@Service
public class PriceServiceImpl extends CRUDimpl<Price, PriceDetailDTO, Integer> implements PriceService {

    @Autowired
    private PriceRepository repository;

    @Autowired
    private PriceMapper mapper;

    @Override
    protected GenericRepository<Price, Integer> getRepository() {
        return repository;
    }

    public List<PriceDTO> getAllData() {
        return mapper.toDtos(repository.findAll());
    }

    /**
     * Method for find a product
     * @param product Id product
     * @param brand Id brand
     * @param date Date to find
     * @return {@link PriceDTO}
     */
    @Override
    public PriceDTO findPrice(Integer product, Integer brand, LocalDateTime date) {
        return mapper.toDto(repository.findPrice(product, brand, date)
                .stream()
                .max(Comparator.comparing(Price::getPriority))
                .orElseThrow(() -> new ModeloNotFoundException("ELEMENT NOT FOUND")));
    }


}
