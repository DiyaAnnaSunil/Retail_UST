package com.sales.salesdemo.controller;

import com.sales.salesdemo.model.ProductDTO;
import com.sales.salesdemo.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sales")
public class SalesController {

    @Autowired
    private SalesService salesService;

    @GetMapping("/product/{id}")
    public ProductDTO getProductDetails(@PathVariable Long id) {
        return salesService.getProductDetails(id);
    }
}
