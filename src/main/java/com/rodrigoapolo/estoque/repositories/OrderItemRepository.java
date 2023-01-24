package com.rodrigoapolo.estoque.repositories;

import com.rodrigoapolo.estoque.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
