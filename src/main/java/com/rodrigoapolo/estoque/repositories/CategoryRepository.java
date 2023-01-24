package com.rodrigoapolo.estoque.repositories;

import com.rodrigoapolo.estoque.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
