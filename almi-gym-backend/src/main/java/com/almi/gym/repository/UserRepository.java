package com.almi.gym.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.almi.gym.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    Optional<User> findByEmailAndPassword(String email, String password);
}
