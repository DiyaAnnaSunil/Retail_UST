package com.sales.salesdemo.client;

import com.sales.salesdemo.model.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// Declare the Feign Client for Inventory Service
@FeignClient(name = "inventory-service", url = "http://localhost:8081") // URL of your Inventory Service
public interface InventoryServiceClient {

    // Fetch product by ID from Inventory Service
    @GetMapping("/api/inventory/{id}")
    ProductDTO getProductById(@PathVariable("id") Long id);
}
