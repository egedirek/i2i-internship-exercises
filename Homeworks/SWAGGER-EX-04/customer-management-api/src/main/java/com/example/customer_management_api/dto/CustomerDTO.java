package com.example.customer_management_api.dto;

import lombok.Data;
import lombok.AllArgsConstructor;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Lombok: Getter, Setter, toString, equals, hashCode otomatik oluşturur
@NoArgsConstructor // Lombok: Boş kurucu metot oluşturur
@AllArgsConstructor // Lombok: Tüm argümanları içeren kurucu metot oluşturur
public class CustomerDTO {

    @Schema(description = "Unique ID of the customer", example = "1")
    private Long id;

    @NotBlank(message = "Customer name cannot be blank") // Validation: Boş olamaz
    @Schema(description = "Full name of the customer", example = "John Doe")
    private String name;

    @Email(message = "Invalid email format") // Validation: Geçerli email formatı olmalı
    @NotBlank(message = "Email address cannot be blank") // Validation: Boş olamaz
    @Schema(description = "Email address", example = "john.doe@example.com")
    private String email;
}