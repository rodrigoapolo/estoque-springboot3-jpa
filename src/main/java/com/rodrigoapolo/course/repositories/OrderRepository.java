package com.rodrigoapolo.course.repositories;

import com.rodrigoapolo.course.entities.Order;
import com.rodrigoapolo.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
