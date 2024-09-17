package com.example.security.repositories;

import com.example.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUserName(String username);
    Boolean existsByUserName(String username);
    boolean existsByEmail(String email);

    Optional<User> findByEmail(String email);
}
