package com.rodrigoapolo.estoque.repositories;

import com.rodrigoapolo.estoque.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
