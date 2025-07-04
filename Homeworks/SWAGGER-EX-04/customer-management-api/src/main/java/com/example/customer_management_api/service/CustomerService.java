package com.example.customer_management_api.service;

import com.example.customer_management_api.dto.CustomerDTO;
import com.example.customer_management_api.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service 
public class CustomerService {

    private final CustomerRepository customerRepository;

    
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
   
        return customerRepository.save(customerDTO);
    }

    public Optional<CustomerDTO> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    public List<CustomerDTO> getAllCustomers() {
        return customerRepository.findAll();
    }

    public CustomerDTO updateCustomer(Long id, CustomerDTO customerDTO) {
       
        return customerRepository.findById(id)
                .map(existingCustomer -> {
                    customerDTO.setId(id); 
                    return customerRepository.save(customerDTO);
                })
                .orElseThrow(() -> new RuntimeException("Customer not found with ID: " + id)); 
    }

    public boolean deleteCustomer(Long id) {
        return customerRepository.deleteById(id);
    }
}
