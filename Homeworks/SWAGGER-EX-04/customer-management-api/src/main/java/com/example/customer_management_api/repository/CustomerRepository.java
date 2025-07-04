package com.example.customer_management_api.repository;

import com.example.customer_management_api.dto.CustomerDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Repository // Spring'e bu sınıfın bir repository olduğunu belirtir
public class CustomerRepository {

    private final List<CustomerDTO> customers = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong(); // ID'leri otomatik oluşturmak için

    public CustomerDTO save(CustomerDTO customer) {
        if (customer.getId() == null) {
            // Yeni müşteri
            customer.setId(counter.incrementAndGet()); // Yeni ID ata
            customers.add(customer);
        } else {
            // Mevcut müşteriyi güncelle
            customers.stream()
                    .filter(c -> c.getId().equals(customer.getId()))
                    .findFirst()
                    .ifPresent(existingCustomer -> {
                        existingCustomer.setName(customer.getName());
                        existingCustomer.setEmail(customer.getEmail());
                    });
        }
        return customer;
    }

    public Optional<CustomerDTO> findById(Long id) {
        return customers.stream()
                .filter(customer -> customer.getId().equals(id))
                .findFirst();
    }

    public List<CustomerDTO> findAll() {
        return new ArrayList<>(customers); // Orijinal listeyi döndürmemek için kopyasını döndür
    }

    public boolean deleteById(Long id) {
        return customers.removeIf(customer -> customer.getId().equals(id));
    }
}