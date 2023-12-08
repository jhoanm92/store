package com.app.store.service;

import com.app.store.dto.PriceDTO;
import com.app.store.dto.detail.PriceDetailDTO;

import java.time.LocalDateTime;
import java.util.List;

public interface PriceService extends CRUD<PriceDetailDTO, Integer> {
    List<PriceDTO> getAllData();
    PriceDTO findPrice(Integer product, Integer brand, LocalDateTime date);
}
