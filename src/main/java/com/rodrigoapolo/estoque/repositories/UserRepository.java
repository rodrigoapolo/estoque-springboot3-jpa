package com.rodrigoapolo.estoque.repositories;

import com.rodrigoapolo.estoque.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
