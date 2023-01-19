package com.rodrigoapolo.ecommerce.repositories;

import com.rodrigoapolo.ecommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
