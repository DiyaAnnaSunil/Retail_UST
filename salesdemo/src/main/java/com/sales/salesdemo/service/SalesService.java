package com.sales.salesdemo.service;

import com.sales.salesdemo.client.InventoryServiceClient;
import com.sales.salesdemo.model.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesService {

    @Autowired
    private InventoryServiceClient inventoryServiceClient;

    public ProductDTO getProductDetails(Long productId) {
        return inventoryServiceClient.getProductById(productId);
    }
}
