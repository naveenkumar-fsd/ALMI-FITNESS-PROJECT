package com.almi.gym.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.almi.gym.entity.User;
import com.almi.gym.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    // Constructor Injection
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Register user
    public void registerUser(User user) {
        userRepository.save(user);
    }

    // Login user
    public boolean loginUser(String email, String password) {

        Optional<User> existingUser = userRepository.findByEmail(email);

        if (existingUser.isEmpty()) {
            return false;
        }

        return existingUser.get().getPassword().equals(password);
    }
}
