package io.codewithwinnie.springmvcrest.service;

import io.codewithwinnie.springmvcrest.domain.Customer;
import io.codewithwinnie.springmvcrest.exception.CustomerNotFoundException;
import io.codewithwinnie.springmvcrest.repository.CustomerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

/**
 * Created on 5/2/2022
 * @author Ifeanyichukwu Otiwa
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    
    private final CustomerRepository customerRepository;
    
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    
    @Override
    public Optional<Customer> findCustomerById(Long id) {
        return customerRepository.findById(id);
    }
    
    @Override
    public List<Customer> findAllCustomer() {
        return customerRepository.findAll();
    }
    
    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
    
    @Override
    public void deleteCustomerById(Long id) {
//        Customer customer =
//                customerRepository.findById(id)
//                        .orElseThrow(() -> new CustomerNotFoundException(HttpStatus.NOT_FOUND));
//
//        customerRepository.delete(customer);
        customerRepository.deleteById(id);
    }
}
