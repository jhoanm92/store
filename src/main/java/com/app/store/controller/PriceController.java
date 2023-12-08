package com.app.store.controller;

import com.app.store.dto.PriceDTO;
import com.app.store.dto.ResponseDTO;
import com.app.store.dto.detail.PriceDetailDTO;
import com.app.store.service.PriceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Class PriceController
 * Class to expose endPoints
 */
@RestController
@RequestMapping("/prices")
public class PriceController {

    private static final Logger log = LoggerFactory.getLogger(PriceController.class);

    @Autowired
    private PriceService service;

    @GetMapping()
    public ResponseEntity<ResponseDTO<List<PriceDetailDTO>>> getAll() {
        return ResponseEntity.ok(new ResponseDTO<>(0, service.getAll(), "All Elements", "OK"));
    }

    @GetMapping("/search")
    public ResponseEntity<ResponseDTO<PriceDTO>> findPrice(@RequestParam(name="product") Integer product,
                                                              @RequestParam(name="brand") Integer brand,
                                                              @RequestParam(name="date") @DateTimeFormat(pattern = "yyyy-MM-dd-HH:mm:ss") LocalDateTime date) {
        log.info("REST - product : {}, brand : {}, start date : {}", product, brand, date);
        return ResponseEntity.ok(new ResponseDTO<>(0, service.findPrice(product, brand, date), "Element Found", "OK"));
    }
}
