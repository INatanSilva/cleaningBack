package com.backendcleaning.cleaning.repository;

import com.backendcleaning.cleaning.service.ServiceRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRequestRepository extends JpaRepository<ServiceRequest, Long> {
}