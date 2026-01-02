package com.almi.gym.controller;

import org.springframework.web.bind.annotation.*;

import com.almi.gym.payload.ApiResponse;
import com.almi.gym.payload.PaymentRequest;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class PaymentController {

    @PostMapping("/payment")
    public ApiResponse processPayment(@RequestBody PaymentRequest request) {

        // 🔥 Mock payment logic (always success)
        return new ApiResponse(true, "Payment Successful");
    }
}
