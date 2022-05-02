package io.codewithwinnie.springmvcrest.service;

import io.codewithwinnie.springmvcrest.domain.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    
    Optional<Customer> findCustomerById(Long id);
    List<Customer> findAllCustomer();
    Customer saveCustomer(Customer customer);
    
    void deleteCustomerById(Long id);
    
}
