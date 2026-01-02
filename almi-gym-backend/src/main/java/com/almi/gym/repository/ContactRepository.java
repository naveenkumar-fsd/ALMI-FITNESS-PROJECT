package com.almi.gym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.almi.gym.entity.ContactMessage;

public interface ContactRepository extends JpaRepository<ContactMessage, Long> {
}
