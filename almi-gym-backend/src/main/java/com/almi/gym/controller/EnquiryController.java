package com.almi.gym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.almi.gym.entity.Enquiry;
import com.almi.gym.payload.ApiResponse;
import com.almi.gym.repository.EnquiryRepository;

@RestController
@RequestMapping("/api/enquiry")
@CrossOrigin(origins = "*")
public class EnquiryController {

    @Autowired
    private EnquiryRepository enquiryRepository;

    @PostMapping
    public ApiResponse submitEnquiry(@RequestBody Enquiry enquiry) {

        enquiryRepository.save(enquiry);

        return new ApiResponse(true, "Enquiry submitted successfully. Our team will contact you soon!");
    }
}
