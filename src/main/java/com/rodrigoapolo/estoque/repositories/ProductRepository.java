package com.rodrigoapolo.estoque.repositories;

import com.rodrigoapolo.estoque.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
