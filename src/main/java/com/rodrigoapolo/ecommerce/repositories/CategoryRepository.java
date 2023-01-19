package com.rodrigoapolo.ecommerce.repositories;

import com.rodrigoapolo.ecommerce.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
