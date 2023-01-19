package com.rodrigoapolo.ecommerce.repositories;

import com.rodrigoapolo.ecommerce.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
