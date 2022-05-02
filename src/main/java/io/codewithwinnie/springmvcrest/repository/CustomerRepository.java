package io.codewithwinnie.springmvcrest.repository;

import io.codewithwinnie.springmvcrest.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Created on 05/2/2022
 * @author Ifeanyichukwu Otiwa
 */

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}