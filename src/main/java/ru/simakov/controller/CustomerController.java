package ru.simakov.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.simakov.model.dto.CustomerRegistrationRq;
import ru.simakov.service.CustomerService;

@RestController
@RequestMapping("api/v1/customers")
public record CustomerController(CustomerService customerService) {
    @PostMapping
    public void registerCustomer(@RequestBody CustomerRegistrationRq customerRegistrationRq) {
        customerService.registerCustomer(customerRegistrationRq);
    }
}
