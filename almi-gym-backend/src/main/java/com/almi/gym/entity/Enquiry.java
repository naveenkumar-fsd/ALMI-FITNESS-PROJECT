package com.almi.gym.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Enquiry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    // Program / Membership / Trainer
    private String enquiryType;

    // Basic Plan / Premium / Weight Loss etc
    private String planName;

    private LocalDateTime createdAt = LocalDateTime.now();

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEnquiryType() {
        return enquiryType;
    }

    public void setEnquiryType(String enquiryType) {
        this.enquiryType = enquiryType;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
