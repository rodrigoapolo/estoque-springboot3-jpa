package com.rodrigoapolo.course.repositories;

import com.rodrigoapolo.course.entities.Order;
import com.rodrigoapolo.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
