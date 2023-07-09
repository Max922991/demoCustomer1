package com.example.democustomer1.service;

import com.example.democustomer1.models.Customer;
import com.example.democustomer1.reposirory.CustomerRepo;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepo customerRepo;

    public void createCustomer(Customer customer) {
        customerRepo.save(customer);
    }

    public Customer findById(Long id) {
        return customerRepo.findById(id)
                 .orElseThrow(() -> new EntityNotFoundException
                         ("Customer with id " + id + " not found"));
    }


}
