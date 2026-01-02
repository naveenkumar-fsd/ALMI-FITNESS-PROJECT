package com.almi.gym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.almi.gym.entity.ContactMessage;
import com.almi.gym.repository.ContactRepository;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Autowired
    private EmailService emailService;

    public void saveContact(ContactMessage contact) {

        // 1️⃣ Save to DB
        contactRepository.save(contact);

        // 2️⃣ Send email safely
        try {
            emailService.sendContactMail(contact);
        } catch (Exception e) {
            System.out.println("MAIL ERROR: " + e.getMessage());
            // ❗ do not throw exception
        }
    }
}
