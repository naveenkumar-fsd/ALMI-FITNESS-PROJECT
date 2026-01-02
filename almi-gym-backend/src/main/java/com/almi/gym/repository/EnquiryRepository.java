package com.almi.gym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.almi.gym.entity.Enquiry;

public interface EnquiryRepository extends JpaRepository<Enquiry, Long> {
}
