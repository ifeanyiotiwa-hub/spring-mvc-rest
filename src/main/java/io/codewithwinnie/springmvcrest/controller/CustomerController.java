package io.codewithwinnie.springmvcrest.controller;

import io.codewithwinnie.springmvcrest.domain.Customer;
import io.codewithwinnie.springmvcrest.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Created by
 * @author Ifeanyichukwu Otiwa
 * 5/2/2022 
 */
 
@RestController
@RequestMapping(CustomerController.BASE_URL)
public class CustomerController {
    public final static String BASE_URL = "/api/v1/customers";
    
    private final CustomerService customerService;
    
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    
    
    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.findAllCustomer();
    }
    
    @GetMapping("/{id}")
    public Optional<Customer> getCustomerById(@PathVariable("id") Long id) {
        return customerService.findCustomerById(id);
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }
}
