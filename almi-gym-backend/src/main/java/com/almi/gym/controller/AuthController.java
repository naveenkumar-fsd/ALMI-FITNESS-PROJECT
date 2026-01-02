package com.almi.gym.controller;

import org.springframework.web.bind.annotation.*;

import com.almi.gym.entity.User;
import com.almi.gym.repository.UserRepository;
import com.almi.gym.payload.ApiResponse;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    private final UserRepository userRepository;

    public AuthController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/register")
    public ApiResponse register(@RequestBody User user) {

        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            return new ApiResponse(false, "Email already registered");
        }

        userRepository.save(user);
        return new ApiResponse(true, "Registration successful");
    }

    @PostMapping("/login")
    public ApiResponse login(@RequestBody User user) {

        return userRepository
                .findByEmailAndPassword(user.getEmail(), user.getPassword())
                .map(u -> new ApiResponse(true, "Login successful"))
                .orElse(new ApiResponse(false, "Invalid email or password"));
    }
}
