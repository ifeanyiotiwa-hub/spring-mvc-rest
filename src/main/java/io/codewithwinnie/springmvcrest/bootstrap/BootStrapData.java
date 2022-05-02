package io.codewithwinnie.springmvcrest.bootstrap;

import io.codewithwinnie.springmvcrest.domain.Customer;
import io.codewithwinnie.springmvcrest.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created on 5/2/2022
 *@author Ifeanyichukwu Otiwa
 */
@Component
public class BootStrapData implements CommandLineRunner {
    private final CustomerRepository customerRepository;
    
    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    
    @Override
    public void run(String... args) throws Exception {
        System.err.println("Loading Customer Data");
    
        Customer customer1 = new Customer();
        customer1.setFirstName("Chika Nwobi");
        customer1.setLastName("Pelumi Banky");
        customerRepository.save(customer1);
        
        Customer customer2 = new Customer();
        customer2.setFirstName("Prosper Temi");
        customer2.setLastName("Emeka Abella");
        customerRepository.save(customer2);
        
        Customer customer3 = new Customer();
        customer3.setFirstName("Flora Chukwuma");
        customer3.setLastName("Samuel Funmi");
        customerRepository.save(customer3);
    
        System.err.println("Customers saved = " + customerRepository.count());
        
    
    }
}
