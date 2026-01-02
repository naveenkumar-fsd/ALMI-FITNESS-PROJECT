package com.almi.gym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.almi.gym.entity.ContactMessage;
import com.almi.gym.service.ContactService;
import com.almi.gym.payload.ApiResponse;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping("/contact")
    public ApiResponse saveContact(@RequestBody ContactMessage contact) {

        contactService.saveContact(contact);

        return new ApiResponse(true, "Message sent successfully");
    }
}
