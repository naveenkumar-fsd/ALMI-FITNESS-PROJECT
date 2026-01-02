package com.almi.gym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.almi.gym.entity.ContactMessage;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendContactMail(ContactMessage contact) {

        SimpleMailMessage mail = new SimpleMailMessage();

        // 🔥 MUST: from address must match spring.mail.username
        mail.setFrom("almifitness79@gmail.com");

        // Admin mail
        mail.setTo("almifitness79@gmail.com");
        
        mail.setReplyTo(contact.getEmail()); 

        mail.setSubject("📩 New Contact Enquiry - ALMI Fitness");

        mail.setText(
            "Name: " + contact.getName() + "\n" +
            "Email: " + contact.getEmail() + "\n" +
            "Subject: " + contact.getSubject() + "\n\n" +
            "Message:\n" + contact.getMessage()
        );

        mailSender.send(mail);

        System.out.println("✔ Mail sent successfully");
    }
}
