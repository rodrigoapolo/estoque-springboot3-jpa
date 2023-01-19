package com.rodrigoapolo.ecommerce.repositories;

import com.rodrigoapolo.ecommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
