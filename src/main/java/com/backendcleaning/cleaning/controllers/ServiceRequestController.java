package com.backendcleaning.cleaning.controllers;

import com.backendcleaning.cleaning.repository.ServiceRequestRepository;
import com.backendcleaning.cleaning.service.ServiceRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/requests")
public class ServiceRequestController {

    @Autowired
    private ServiceRequestRepository serviceRequestRepository;

    @PostMapping
    public ServiceRequest createServiceRequest(@RequestBody ServiceRequest request) {
        return serviceRequestRepository.save(request);
    }

    @GetMapping
    public List<ServiceRequest> findAllRequests() {
        return serviceRequestRepository.findAll();
    }
}
