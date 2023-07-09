package com.example.democustomer1.controller;

import com.example.democustomer1.models.Customer;
import com.example.democustomer1.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping("/create")
    public void create(@RequestBody Customer customer) {
        customerService.createCustomer(customer);
    }

    @GetMapping("/{id}")
    public Customer findById(@PathVariable Long id) {
       return customerService.findById(id);
    }
}
