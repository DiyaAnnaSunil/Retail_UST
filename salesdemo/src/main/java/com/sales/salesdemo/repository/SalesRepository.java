package com.sales.salesdemo.repository;



import com.sales.salesdemo.model.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<Sales, Long> {
}

