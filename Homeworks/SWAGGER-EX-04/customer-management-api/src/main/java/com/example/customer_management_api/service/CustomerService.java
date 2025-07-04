package com.example.customer_management_api.service;

import com.example.customer_management_api.dto.CustomerDTO;
import com.example.customer_management_api.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // Spring'e bu sınıfın bir servis olduğunu belirtir
public class CustomerService {

    private final CustomerRepository customerRepository;

    // Bağımlılık Enjeksiyonu (Constructor Injection)
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
        // İş mantığı buraya gelebilir (örneğin, email unique kontrolü)
        return customerRepository.save(customerDTO);
    }

    public Optional<CustomerDTO> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    public List<CustomerDTO> getAllCustomers() {
        return customerRepository.findAll();
    }

    public CustomerDTO updateCustomer(Long id, CustomerDTO customerDTO) {
        // Güncellenecek müşterinin var olup olmadığını kontrol et
        return customerRepository.findById(id)
                .map(existingCustomer -> {
                    customerDTO.setId(id); // ID'yi set et
                    return customerRepository.save(customerDTO);
                })
                .orElseThrow(() -> new RuntimeException("Customer not found with ID: " + id)); // Müşteri bulunamazsa hata fırlat
    }

    public boolean deleteCustomer(Long id) {
        return customerRepository.deleteById(id);
    }
}