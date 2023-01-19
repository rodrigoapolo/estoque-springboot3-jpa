package com.rodrigoapolo.ecommerce.repositories;

import com.rodrigoapolo.ecommerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
